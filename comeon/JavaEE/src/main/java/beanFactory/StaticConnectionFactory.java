package beanFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
     ConnectionFactory cf = new ConnectionFactory();
     cf.getConnection();

     staticConnectionFactory.getConnection();
 */

public class StaticConnectionFactory {

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&serverTimezone=UTC", "root", "123456");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

}
