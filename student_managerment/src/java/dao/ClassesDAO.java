/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Classes;

/**
 *
 * @author ADMIN
 */
public class ClassesDAO extends DBContext
{
    public  ArrayList<Classes> getallclasses(){
        ArrayList<Classes> list=new ArrayList<>();
        String sql="Select * from class";
        try {
            PreparedStatement statement=connection.prepareCall(sql);
           ResultSet rs= statement.executeQuery();
            while(rs.next()){
                Classes classses=new Classes(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(classses);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
 
    }
}
