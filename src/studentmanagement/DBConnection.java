/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.sql.*;
public class DBConnection {
 private static final String URL = "jdbc:mysql://156.67.76.7:3306/u997807830_softwareConst";
 private static final String USER = "u997807830_SE204";
 private static final String PASSWORD = "SE204softwareconstruction";
 public static Connection connectOnlineDB()
 {

 Connection connection = null;
 try {
 // Load MySQL JDBC Driver
 Class.forName("com.mysql.cj.jdbc.Driver");
 // Establish the connection
 connection = DriverManager.getConnection(URL, USER, PASSWORD);

 System.out.println("Database Connected!");

 return connection;
 } catch (Exception e) {
 System.out.println("Not connected");
 return null;
 }

 }
}
