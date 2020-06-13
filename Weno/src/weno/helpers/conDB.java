package weno.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conDB {
	
	public String user = "postgres";
	public String pass = "princho";
	public String url= "jdbc:postgresql://localhost:5432/WENO";
	PreparedStatement pt = null;
	ResultSet rc = null;
	Connection conex =null;
	boolean error;
	
	public Connection DBConnection() {
		
		try {
			Class.forName("org.postgresql.Driver");
			conex= DriverManager.getConnection(url, user, pass);
			}
		catch(SQLException e ) {
			System.out.println("error "+ e.getMessage());
			error=true;
		}catch(ClassNotFoundException ex) {
			System.out.println("error de drivers");
			error = true;
		}
		return conex;
	}
	
	
	public Connection end() {
		
		try {
			conex.close();
			
		}
		catch(SQLException ex) {
			Logger.getLogger(conDB.class.getName()).log(Level.SEVERE, null ,ex);
			
		}
		return conex;
	}
	
	
	
	public void nregistro(String Nombre, String Usuario, String Correo, String Cedula, String Telefono, String Contrasena) {
		try {
			pt = conex.prepareCall("INSERT INTO usuario VALUES( ?, ?, ?, ?, ?, ?)");
		    pt.setString(1, Nombre);
		    pt.setString(2, Correo);
		    pt.setString(3, Usuario);
		    pt.setString(4, Cedula);
		    pt.setString(5, Telefono);
		    pt.setString(6, Contrasena);
		    rc = pt.executeQuery();
		    
		    
		}catch (SQLException e) {
            Logger.getLogger(conDB.class.getName()).log(Level.SEVERE,null, e);
         }
	       return;
	}
	
	public int autenticacion(String password, String usname) {
    	try(Connection conn = DriverManager.getConnection(url, user, pass);
    			Statement stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery("SELECT * FROM Ususario WHERE Unombreo = '"+usname+"' AND contrasena ='"+pass+"'")){
    			if(rs.next() == true) {
    				
    				System.out.println("correcto");	
    			}else{
    				
    	            System.out.println("erro nombre o contrasena incorrectos");	 	        
    			} 
    			conn.close();
    	} catch (SQLException e) {
			e.printStackTrace();
			
			System.out.println("error");
		}
		return 0;
	}
	
	
	
}