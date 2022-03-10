
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Historico;
import view.Calculadora;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class Conexao {
    Calculadora calc = new Calculadora();
    private Connection con;
    PreparedStatement stmt;
    Historico historico = new Historico();
    ResultSet rs = null;
    
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
        stmt.setString(1, historico.getExpressao());
        stmt.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(calc, "Erro ao salvar resultado no banco de dados!");
        }
        desconectar();
       
    }
    
    public List<Historico> executaSql(){
        String SQL = "SELECT * FROM historico";
        List<Historico> lista_historico = new ArrayList();
        
        try{
            stmt = con.prepareStatement(SQL);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Historico historico = new Historico();
                
                
                historico.setExpressao(rs.getString("resultado"));
                
                lista_historico.add(historico);
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário.");
        }
        return lista_historico;
    }
    
    public void desconectar(){ // metodo para realizar a desconexão com a base dados 
        try {
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(calc, "Erro ao fechar conexão!");
        }
    
    
    }
    
}
