/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Pergunta;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luiz Guilherme
 */
public class PerguntaDAO {
    
    PreparedStatement pst;
    String sql;
    
    
    
    public int salvar(Pergunta pergunta) throws SQLException
    {
        int idPergunta = 0;
        sql = "insert into perguntas values (?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setInt(1, 0);
        pst.setString(2, pergunta.getDescricao());
        pst.setString(3, pergunta.getComentario());
        pst.setInt(4, NULL);
        pst.execute();
        ResultSet rs = pst.getGeneratedKeys();
        while (rs.next())
        {
            idPergunta = rs.getInt(1);
        }
        pst.close();
        return idPergunta;
        

    }
     public List<Pergunta> ListaPergunta() throws SQLException
    {
        List<Pergunta> listapergunta;
        listapergunta = new ArrayList<>();
        sql = "select * from perguntas";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while (rs.next())
        {
            listapergunta.add(new Pergunta(rs.getInt("id"),rs.getString("descricao"),rs.getString("comentario"),rs.getInt("resposta_certa")));
        }
        pst.close();
        return listapergunta;
        
        
    }
}

