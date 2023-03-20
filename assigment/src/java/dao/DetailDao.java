/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.oracle.wls.shaded.org.apache.bcel.generic.AALOAD;
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
public class DetailDao extends DBContext{
     public void delete(String tourid,String userid){
               String sql="delete from [DetailTour] where [tourid]=? and [userid]=?" ;
            try {
               
                  PreparedStatement statement=connection.prepareCall(sql);
                  statement.setString(1, tourid);
                    statement.setString(2, userid);
                  statement.executeUpdate();
                  
            } catch (Exception e) {
            }
           
            
        }
//     public ArrayList<DetailTour> getFeedbackByConditions(String id) {
//        ArrayList<DetailTour> FeedbackList = new ArrayList<>();
//        try {
//            String sql = "select userid,username,[address],phone,tourid,[name],dob,price from [Tour2] inner join detailtour ON [Tour2].id=detailtour.tourid \n" +
//" INNER JOIN [user] ON detailtour.userid=[user].id";
//              if(id!=null){
//             sql+="where id"+id;
//             
//             
//         }
//         
//            PreparedStatement stm = connection.prepareStatement(sql);
//                   ResultSet rs = stm.executeQuery();
//           // stm.setString(1, "%" + id + "%");
////            stm.setString(2, "%" + status + "%");
////            stm.setString(3, "%" + fullname + "%");
////            stm.setString(4, "%" + product + "%");
//          //  stm.setInt(5, (index - 1) * 9);
//           // ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                User u=new User();
//                u.setId(rs.getInt("userid"));
//                    u.setUsername(rs.getString("username"));
//                    u.setAddres(rs.getString("[address]"));
//                u.setPhone(rs.getString("phone"));
//                Tour t=new Tour();
//                t.setId(rs.getInt("tourid"));
//                t.setName(rs.getString("[name]"));
//               t.setDob(rs.getDate("dob"));
//               t.setPrice(rs.getFloat("price"));
//                
//               u.se
// //s.getString("address"), rs.getString("phone")), new Tour(rs.getInt("tourid"), rs.getString("name")), rs.getDate("dob"), rs.getFloat("price")));
//                //FeedbackList.add(fb);
//            }
//        } catch (SQLException e) {
//        }
//        return FeedbackList;
//    }
//  public ArrayList<DetailTour> getuserandtour(String id) {
//        ArrayList<DetailTour> list = new ArrayList<>();
//        try {
//            String sql = "select userid,username,[address],phone,tourid,[name],dob,price from [Tour2] inner join detailtour ON [Tour2].id=detailtour.tourid \n"
//                    + " INNER JOIN [user] ON detailtour.userid=[user].id ";
//            if (id != null) {
//                sql += "where [user].id=" + id;
//
//            }
//
//            PreparedStatement stm = connection.prepareStatement(sql);
//            ResultSet rs = stm.executeQuery();
//            // stm.setString(1, "%" + id + "%");
////            stm.setString(2, "%" + status + "%");
////            stm.setString(3, "%" + fullname + "%");
////            stm.setString(4, "%" + product + "%");
//            //  stm.setInt(5, (index - 1) * 9);
//            // ResultSet rs = stm.executeQuery();
//            while (rs.next()) {
//                //DetailTour t =new DetailTour(
//               // User u = new User();    
//             rs.getInt("userid"),
//         rs.getString("username"),
//                rs.getString("address"),
//               rs.getString("phone"),
//               // Tour t = new Tour();
//           rs.getInt("tourid"),
//               rs.getString("name"),
//rs.getDate("dob"),
//             rs.getFloat("price")
//                    
//                        );     
                        
                        
               // u.setTour(t);
//                list.add(t);
//                //s.getString("address"), rs.getString("phone")), new Tour(rs.getInt("tourid"), rs.getString("name")), rs.getDate("dob"), rs.getFloat("price")));
//                //FeedbackList.add(fb);
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return list;
//    }
         public void adddetail(String userid, String tourid) {
        try {
            String sql ="INSERT INTO [detailtour] ([userid],[tourid]) VALUES(?,?)";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, userid);
            statement.setString(2, tourid);
         

            statement.executeUpdate();

            ResultSet rs = statement.executeQuery();

        } catch (Exception e) {

        }

    }
         
         public static void main(String[] args) {
             
        DetailDao d= new DetailDao();
  d.adddetail("1", "2");
          
                 
             }
    
}
