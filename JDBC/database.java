package org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class database {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/temp";
        String user = "postgres";
        String password = "140914";
        String query="Select * from users";
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement st= conn.createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String email=rs.getString("email");
                String name=rs.getString("name");
                System.out.println("Id:"+id);
                System.out.println("Email:"+email);
                System.out.println("Name:"+name);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while connecting");
        }

    }
}
