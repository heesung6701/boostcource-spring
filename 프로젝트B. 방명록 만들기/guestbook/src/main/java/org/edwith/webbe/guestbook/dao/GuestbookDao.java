package org.edwith.webbe.guestbook.dao;

import org.edwith.webbe.guestbook.dto.Guestbook;
import org.edwith.webbe.guestbook.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestbookDao {
  private final String SELECT_ALL = "SELECT * FROM guestbook";
  private final String INSERT = "INSERT guestbook(name, content, regdate) values(?,?,CURRENT_TIMESTAMP())";

  public List<Guestbook> getGuestbooks() {
    List<Guestbook> list = new ArrayList<>();

    try (Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(SELECT_ALL)) {
      while (rs.next()) {
        list.add(new Guestbook(rs.getString("name"), rs.getString("content")));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }

  public void addGuestbook(Guestbook guestbook) {
    try (Connection conn = DBUtil.getConnection();
        PreparedStatement stmt = conn.prepareStatement(INSERT)) {
      stmt.setString(1, guestbook.getName());
      stmt.setString(2, guestbook.getContent());
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
