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
    // 코드를 작성하세요.
  }
}
