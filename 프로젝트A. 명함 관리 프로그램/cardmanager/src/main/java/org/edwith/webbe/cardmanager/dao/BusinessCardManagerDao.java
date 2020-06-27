package org.edwith.webbe.cardmanager.dao;

import org.edwith.webbe.cardmanager.common.JdbcContext;
import org.edwith.webbe.cardmanager.dto.BusinessCard;
import org.edwith.webbe.cardmanager.exception.CustomException;
import java.sql.PreparedStatement;
import java.util.List;

public class BusinessCardManagerDao {
  
  private final JdbcContext jdbcContext;
   
   public BusinessCardManagerDao(JdbcContext jdbcContext) {
     this.jdbcContext = jdbcContext;
   }

   public List<BusinessCard> searchBusinessCard(String keyword) throws CustomException{
     return jdbcContext.<BusinessCard>executeQuery(conn -> {
       PreparedStatement ps = conn.prepareStatement(BusinessCardManagerDaoSqls.SELECT_LIKE);
       ps.setString(1, "%"+keyword+"%");
       return ps;
     }, rs -> {
       try {
         String name = rs.getString("name");
         String phone = rs.getString("phone");
         String company = rs.getString("company_name");
         return new BusinessCard(name, phone, company);
       } catch(Exception e) {
         e.printStackTrace();
       }
       return null;
     });
   }

   public boolean addBusinessCard(BusinessCard businessCard) throws CustomException{
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
