package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.common.JdbcContext;
import org.edwith.webbe.cardmanager.dto.BusinessCard;
import java.sql.PreparedStatement;
import java.util.List;

public class BusinessCardManagerDao {
  
   final private JdbcContext jdbcContext;
   
   public BusinessCardManagerDao(JdbcContext jdbcContext) {
     this.jdbcContext = jdbcContext;
   }

   public List<BusinessCard> searchBusinessCard(String keyword) {
     // 구현하세요.
   }

   public boolean addBusinessCard(BusinessCard businessCard) {
     int result = jdbcContext.executeUpdate(conn -> {
       PreparedStatement ps = conn.prepareStatement(BusinessCardManagerDaoSqls.INSERT);
       ps.setString(1, businessCard.getName());
       ps.setString(2, businessCard.getPhone());
       ps.setString(3, businessCard.getCompanyName());
       return ps;
     });
     return result > 0;
   }
}
