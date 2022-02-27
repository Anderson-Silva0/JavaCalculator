
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Historico;

public class Conexao {
    
    private Connection con;
    PreparedStatement stmt;
    Historico historico = new Historico();
    
    private String CLASS_DRIVER = "com.mysql.jdbc.Driver";
    private String USUARIO = "root"; 
    private String SENHA = "";
    private String URL_SERVIDOR = "jdbc:mysql://localhost:3306/calchistorico?useSSL=false";
    
    
    public void conectar(){
        try{
            Class.forName(CLASS_DRIVER);
            con = DriverManager.getConnection(URL_SERVIDOR, USUARIO, SENHA);
        }catch(Exception e){
            if( e instanceof ClassNotFoundException){
                System.out.println("Verifique o drive de conexão.");
            }else{
                System.out.println("Verifique se o servidor está ativo.");
            }
        }
    }
    
    public void inserir(Historico historico) throws SQLException{
        String SQL = "INSERT INTO historico (resultado) VALUES (?)";
        conectar();
        try{
        stmt = con.prepareStatement(SQL);
        stmt.setString(1, historico.getResultado());
        stmt.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao salvar resultado no banco de dados!");
        }
        desconectar();
       
    }
    
    public void desconectar(){ // metodo para realizar a desconexão com a base dados 
        try {
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao fechar conexão.");
        }
    
    
    }
    
}
