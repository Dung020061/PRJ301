/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.DetailTour;
import model.Tour;
import model.User;

/**
 *
 * @author ADMIN
 */
public class UserDao extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public User checkLogin(String username, String password) {

        String sql = "  select * from [user] where username = ? and password = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6)
                );

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public ArrayList<User> getallusers() {
        ArrayList<User> list = new ArrayList<>();
        String sql = "SELECT TOP (1000) [id]\n"
                + "      ,[username]\n"
                + "      ,[password]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "      ,[roleid]\n"
                + "  FROM [tour].[dbo].[user] ";
        try {
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                User s = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                list.add(s);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public void register(String username, String password, String address, String phone) {
        try {
            String sql = "	   INSERT INTO [user] ([username],[password],[address],[phone], [roleid]) VALUES(?,?,?,?,0)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, address);
            statement.setString(4, phone);

            statement.executeUpdate();

            ResultSet rs = statement.executeQuery();

        } catch (Exception e) {

        }

    }

    public void delete(String id) {
        String sql = "  delete from [user] where id=?";
        try {

            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, id);
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi la:" + e.getMessage());
        }

    }
//                public  ArrayList<User> getallusersandtour(String id){
//                        ArrayList<User> list = new ArrayList<>();  
//                        String sql=" select userid,username,[address],phone,tourid,[name],dob,price from [Tour2] inner join detailtour ON [Tour2].id=detailtour.tourid\n" +
//"  INNER JOIN [user] ON detailtour.userid=[user].id";
//                    try {
//                           PreparedStatement statement=connection.prepareCall(sql);
//           ResultSet rs= statement.executeQuery();
//                        while (rs.next()) {                            
//                                         
//                        
//  User u= new User(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
//  Tour t=new Tour(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getFloat(5), rs.getString(6));
//                  list.add(u);       
//                        
//                        }
//                         return list;
//                        
//                    } catch (Exception e) {
//                           e.printStackTrace();
//                        return null;
//                    }
//                    
//                    
//                
//                }

    public void blockuser(int id) {
        String sql = "update [user] set [roleid]=2 where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //block
    public void unBlockuser(int id) {
        String sql = "  update [user] set [roleid]=0 where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<User> getuserandtour(String id) {
        ArrayList<User> list = new ArrayList<>();
        try {
            String sql = "select userid,username,[address],phone,tourid,[name],dob,price from [Tour2] inner join detailtour ON [Tour2].id=detailtour.tourid \n"
                    + " INNER JOIN [user] ON detailtour.userid=[user].id ";
            if (id != null) {
                sql += "where [user].id=" + id;

            }

            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            // stm.setString(1, "%" + id + "%");
//            stm.setString(2, "%" + status + "%");
//            stm.setString(3, "%" + fullname + "%");
//            stm.setString(4, "%" + product + "%");
            //  stm.setInt(5, (index - 1) * 9);
            // ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("userid"));
                u.setUsername(rs.getString("username"));
                u.setAddres(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                Tour t = new Tour();
                t.setId(rs.getInt("tourid"));
                t.setName(rs.getString("name"));
                t.setDob(rs.getDate("dob"));
                t.setPrice(rs.getFloat("price"));

                u.setTour(t);
                list.add(u);
                //s.getString("address"), rs.getString("phone")), new Tour(rs.getInt("tourid"), rs.getString("name")), rs.getDate("dob"), rs.getFloat("price")));
                //FeedbackList.add(fb);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

     public User getalluserByID(String uid) {

        String sql = "   select * from [user] where id=?;";

        try {
            PreparedStatement statement = connection.prepareCall(sql);

            statement.setString(1, uid);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));

            }

        } catch (Exception e) {

        }

        return null;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        UserDao D = new UserDao();

        ArrayList<User> list = D.getuserandtour("3");
        for (User user : list) {
            System.out.println(user.toString());
        }

    }
}
