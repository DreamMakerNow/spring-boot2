package fuzaDuixiang;

// DATE: 2021/2/25-20:08  Happy Every Day


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTwo {
    public Connection getConnection(){
        Connection root = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            root = DriverManager.getConnection("jdbc:mysql://localhost:3306/web?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "123456");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return root;
    }
}
