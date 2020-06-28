package org.edwith.webbe.guestbook.util;

import java.sql.*;
import org.edwith.webbe.guestbook.config.DBConfig;

public class DBUtil {
    public static Connection getConnection(){
        return getConnection(DBConfig.dburl,DBConfig.dbUser,DBConfig.dbpasswd);
    }

    public static Connection getConnection(String dbURL, String dbId, String dbPassword){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbId, dbPassword);
            return conn;
        }catch(Exception ex){
            throw new RuntimeException("Connection Error");
        }
    }
}
