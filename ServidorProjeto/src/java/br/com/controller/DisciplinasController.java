package br.com.controller;

import br.com.conexao.ConexaoMySql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alysson Martin
 */
public class DisciplinasController {
    
    public static int Quantidade() {
        int qtde = 0;
        try {
            Connection con = ConexaoMySql.getConexao();

            PreparedStatement stmt = con.prepareStatement("select count(*) as numero from disciplinas");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                qtde = rs.getInt("numero");
            }

            ConexaoMySql.FecharConexao();

        } catch (SQLException e) {

        }
        return qtde;
    }
}
