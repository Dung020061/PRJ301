/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Tour;

/**
 *
 * @author ADMIN
 */
public class TourDao extends DBContext {

    public ArrayList<Tour> getalltour() {
        ArrayList<Tour> list = new ArrayList<>();
        String sql = "  select * from Tour2";
        try {
            PreparedStatement statement = connection.prepareCall(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Tour t = new Tour(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getFloat(5), rs.getString(6));

                list.add(t);

            }
            return list;

        } catch (Exception e) {
            System.out.println("loi la:" + e.getMessage());
            e.printStackTrace();
            return null;

        }
    }

    public Tour getallTourByID(String id) {

        String sql = "   select * from [Tour2] where id=?;";

        try {
            PreparedStatement statement = connection.prepareCall(sql);

            statement.setString(1, id);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                return new Tour(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getFloat(5), rs.getString(6));

            }

        } catch (Exception e) {

        }

        return null;
    }

    public ArrayList<Tour> Searchbyname(String txtSearch) {
        ArrayList<Tour> list = new ArrayList<>();
        try {
            String sql = " select * from [Tour2] where id=?; ";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + txtSearch + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour p = new Tour(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getFloat(5), rs.getString(6));
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void add(String id, String name, String dob, String img, String price, String description) {
        String sql = "  insert into [Tour2] (id,name,dob,img,price,description ) values(?,?,?,?,?,?)";
        try {
//                  String sql=" insert into [Tour] ([name]\n" +
//"      ,[dob]\n" +
//"      ,[img]\n" +
//"      ,[price]\n" +
//"      ,[description]) values ('?','?','?','?','?')";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setInt(1, Integer.parseInt(id));
            statement.setString(2, name);
            statement.setString(3, dob);
            statement.setString(4, img);

            statement.setFloat(5, Float.parseFloat(price));
            statement.setString(6, description);

            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public ArrayList<Tour> manager(String Search) {
        ArrayList<Tour> list = new ArrayList<>();
        try {
            String sql = "  select * from Tour2\n"
                    + "  where [name] like '%?%' ";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%" + Search + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Tour p = new Tour(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getFloat(5), rs.getString(6));
                list.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(String id) {
        String sql = "delete from [Tour2] where [id]=?";
        try {

            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, id);
            statement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi la:" + e.getMessage());
        }

    }

    public void updateTour(String id, String name, String dob, String img, String price, String description) {
        String sql = "update [Tour2] SET [name]=?,[dob]=?,[img]=?,[price]=?,[description]=? WHERE  [id]=?";

        try {
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setString(1, name);
            statement.setString(2, dob);
            statement.setString(3, img);
            statement.setFloat(4, Float.parseFloat(price));
            statement.setString(5, description);
            statement.setInt(6, Integer.parseInt(id));
            statement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Update:" + e.getMessage());
        }

    }

    

}
