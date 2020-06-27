package org.edwith.webbe.cardmanager.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.edwith.webbe.cardmanager.config.DBConfig;

public class JdbcContext {

  public int executeUpdate(StatementStrategy stmt) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      return 0;
    }
    try (
        final Connection conn =
            DriverManager.getConnection(DBConfig.dburl, DBConfig.dbUser, DBConfig.dbpasswd);
        final PreparedStatement ps = stmt.makePreparedStatement(conn)) {
        return ps.executeUpdate();
    } catch (SQLException sqlException) {
      sqlException.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return 0;
  }
}
