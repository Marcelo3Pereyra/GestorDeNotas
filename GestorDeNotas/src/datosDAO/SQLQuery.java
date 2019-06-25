package datosDAO;

import java.sql.*;
public class SQLQuery {
    protected Connection conexion;
    protected PreparedStatement consulta;
    protected ResultSet datos;
    
    public void conectar(String servidor, String bd, String usuario, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.conexion = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + bd, usuario, password);
    }
    public void desconectar() throws SQLException {
        this.conexion.close();
        this.consulta.close();
    }
    public void desconectar(ResultSet rs) throws SQLException {
        this.desconectar();
        rs.close();
    }
}