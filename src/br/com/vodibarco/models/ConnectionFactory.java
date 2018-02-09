package br.com.vodibarco.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory
{
   private static final String URL = "jdbc:mysql://localhost:3306/vodibarco?useSSL=false";
   private static final String USER = "root";
   private static final String PASSWORD = "***********";
   private static boolean estaConectado = false;

   public static Connection getConexao()
   {
         try {
            return DriverManager.getConnection(URL,USER,PASSWORD);

         } catch (SQLException e) {
            e.printStackTrace();
         }
         return null;
   }

   public static void closeConnection(Connection connection)
   {
      try {
         if (connection != null)
            connection.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static void close(Connection connection, Statement stmt){
      closeConnection(connection);
      try {
         if (stmt != null)
            stmt.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
