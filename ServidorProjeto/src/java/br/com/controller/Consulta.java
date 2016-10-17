package br.com.controller;

import br.com.conexao.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alysson Martin
 */
public class Consulta {
    public static String ConsultarBanco(String nomeTabela, String chave, String campo, int id) {

        String retorno = "";

        try {
            Connection con = ConexaoMySql.getConexao();
            
                PreparedStatement stmt = con.prepareStatement("select * from " 
                        + nomeTabela + " where " + chave + " = " + id);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    retorno = (rs.getString(campo));
                }

            ConexaoMySql.FecharConexao();

        } catch (Exception e) {
            System.err.println(e);
        }
        return retorno;
    }
}
