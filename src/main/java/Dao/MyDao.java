package Dao;

import entity.MyEntity;

import java.sql.*;
import java.util.ArrayList;

public class MyDao {
    Connection con;
    Statement sta;
    ResultSet rst;
    PreparedStatement ps;

    public ArrayList<String> Link(String id) {
        ArrayList<String> myentity = new ArrayList<String>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/book", "root", "FFFF");
            String sql = "select id,bookName,bookDate from library where id=? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rst = ps.executeQuery();
            while (rst.next()) {
                myentity.add(rst.getString("id"));

                myentity.add(rst.getString("bookName"));

                myentity.add(rst.getString("bookDate"));
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return myentity ;

    }

}
