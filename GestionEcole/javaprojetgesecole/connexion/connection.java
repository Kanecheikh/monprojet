package javaprojetgesecole.connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	
	Connection con; 
	public connection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost/ges_ecole","root","");
			
			System.out.println("connection etablie");
		
		} catch (Exception e) {
			
		
			System.out.println("Base de donnee introuvable");
		}
	}
	public Connection etablirconnection() {
		return con;
	}
	//savoir l'acc�s � la connection
	/*public static void main(String[] args) {
		
		connection p=new connection();
	
		//System.out.println(p.etablirconnection());
	}*/
	
	}
	

