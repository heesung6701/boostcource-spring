package org.edwith.webbe.cardmanager.dao;

public class BusinessCardManagerDaoSqls {
  private BusinessCardManagerDaoSqls() {
    throw new IllegalStateException("Utility class");
  }
  
  public static final String INSERT = "INSERT INTO business_card(name, phone, company_name) VALUES ( ?, ?, ? )";
  public static final String SELECT_LIKE = "SELECT * FROM business_card WHERE NAME LIKE ?";
}
