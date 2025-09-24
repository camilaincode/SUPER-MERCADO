package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	private static final String URL = "jdbc:mysql://localhost:3306/supermercado";
    private static final String USUARIO = "root";
    private static final String SENHA = "admin";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar() {
    	Connection conexao = null;
    	try {
    		Class.forName(DRIVER);
    		conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
    	} catch(SQLException e) {
    		System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
    	} catch (ClassNotFoundException e) {
    		System.out.println("Driver JDBC não encontrado: " + e.getMessage());
		}
    	return conexao;
    }
    
    public static void desconectar(Connection conexao) {
    	if (conexao != null) {
    		 try {
                 conexao.close();
             } catch (SQLException e) {
                 System.err.println("Erro ao fechar a conexão: " + e.getMessage());
             }
    	}
    }
}
