/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class StudentDAO extends DBContext{
     public  ArrayList<Student> getallStudentByClassID(String ClassId){
             ArrayList<Student> list=new ArrayList<>();
        String sql="Select * from Student where id_class=?";
        
        try {
            PreparedStatement statement=connection.prepareCall(sql);
           
            statement.setString(1, ClassId);
            
           ResultSet rs= statement.executeQuery();
            while(rs.next()){
                Student student=new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
 
    }
         
         
         
         
         
     


    public  ArrayList<Student> filterStudent(String name,String gender,String classID){
             ArrayList<Student> list=new ArrayList<>();
//        String sql="  SELECT *  FROM Student\n" +
//"  WHERE LOWER([name]) like ? and gender=?";
//        if(gender!=""){
//            sql=sql+"and gender=?"+gender;
//        }
        try {
                 String sql="  SELECT *  FROM Student\n" +
"  WHERE LOWER([name]) like ? ";
           if(gender!=""){
               sql=sql+"and gender= "+gender;
           }      
              if(classID!=""){
                   sql=sql+"and id_class= "+classID;
              }   
                 
                 
                 
            PreparedStatement statement=connection.prepareCall(sql);
             statement.setString(1, "%"+name+"%");
//            statement.setString(2, gender);
//              statement.setString(3, classID);
           ResultSet rs= statement.executeQuery();
            while(rs.next()){
                Student student=new Student(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getInt(5));
                list.add(student);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
 
    }
    
    public static void main(String[] args) {
        
    }
    
    
}
    
    
    
    
