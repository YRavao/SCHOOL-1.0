/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_classes;

import java.sql.*;

/**
 *
 * @author Yolive
 */

public class DBCon {
	
	    private static Connection connection = null;
	    private final static String ADRESS   = "jdbc:mysql://localhost";
	    private final static String DATABASE = "SCHOOL";
	    private final static String USER     = "root";
	    private final static String PASSWORD = "";
	    private final static String PORT     = "3306";
	    private final static String DRIVER   = "com.mysql.jdbc.Driver";
	
	    
	    private static void loadDriver() {
	       
                try {
	            Class.forName("com.mysql.jdbc.Driver");
	        }
	        catch (Exception e) {
	            errorHandler("Le driver n'a pas pu être chargé" + DRIVER, e);
	        }
	    }

	  
	    private static void loadConnection() {
	        try {
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
	        }
	        catch (SQLException e) {
	            errorHandler("Echec de connexion à la base de données " + getFormatedUrl(), e);         
	        }
	    }
	    
	    private static void errorHandler(String message, Exception e) {
	        System.out.println(message);  
	        if (e != null) System.out.println(e.getMessage());   
	    }

	    
	    private static String getFormatedUrl() {
	        return "jdbc:mysql://localhost:";
	    }
	    
	    
	    public static Connection getConnection() {
	        if (connection == null) {
	            loadDriver();
	            loadConnection();
	        }
	        return connection;
	    }
	    
	   
	    
	    public static void closeConnection() {
	        if (connection == null) {
	            errorHandler("Aucune connexion", null);
	        }
	        else {
	            try {
	                connection.close();
	                connection = null;
	            }
	            catch (SQLException e) {
	                errorHandler("Echec de fermeture de connexion", e);
	            }
	        }
	    }
  
                    
            
}
