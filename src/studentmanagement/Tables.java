/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.sql.*;
public class Tables {
    Connection con= DBConnection.connectOnlineDB();
    Statement st= null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public void CreateTables(){
 String sql1 = "create table IF NOT EXISTS TeacherAnnouncement(StudentID int(100),Message varchar(100));";
 String sql2 = "create table IF NOT EXISTS RegisterStudent(StudentName varchar(100), StudentID int(100),Department varchar(100),Grade int(100));";
 String sql3 = "create table IF NOT EXISTS Notes(StudentID int(100),CourseCode int(100), Midterm int(100), Final int(100),Project int(100),LetterGrade varchar(100));";
 String sql4 = "create table IF NOT EXISTS RegisterTeacher(Name varchar(100), CourseCode int(100), CourseName varchar(100), Password varchar(100));";
 try{
 st = con.createStatement();
 st.executeUpdate(sql1);
  st.executeUpdate(sql2);
  st.executeUpdate(sql3);
  st.executeUpdate(sql4);
 System.out.println("Tables created");
 }
 catch(Exception e){
 System.out.println("Tables not created");
 }
 }
}

