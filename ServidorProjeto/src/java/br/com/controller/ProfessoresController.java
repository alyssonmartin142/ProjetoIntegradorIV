package br.com.controller;

import br.com.conexao.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alysson Martin
 */
public class ProfessoresController {

    public static int Quantidade() {
        int qtde = 0;
        try {
            Connection con = ConexaoMySql.getConexao();

            PreparedStatement stmt = con.prepareStatement("select count(*) as numero from professores");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                qtde = rs.getInt("numero");
            }

            ConexaoMySql.FecharConexao();

        } catch (Exception e) {

        }
        return qtde;
    }
}
