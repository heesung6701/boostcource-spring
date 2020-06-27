package org.edwith.webbe.cardmanager.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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
  
  public <T> List<T> executeQuery(StatementStrategy stmt, Function<ResultSet, T> mapper) {
    ArrayList<T> result = new ArrayList<>();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    try (
        final Connection conn =
            DriverManager.getConnection(DBConfig.dburl, DBConfig.dbUser, DBConfig.dbpasswd);
        final PreparedStatement ps = stmt.makePreparedStatement(conn)) {
      ResultSet rs = ps.executeQuery();
      while(rs.next()) {
        result.add(mapper.apply(rs));
      } 
    } catch (SQLException sqlException) {
      sqlException.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
}
