package org.edwith.webbe.cardmanager.dao;

public class BusinessCardManagerDaoSqls {
  public static String INSERT = "INSERT INTO business_card(name, phone, company_name) VALUES ( ?, ?, ? )";
  public static String SELECT_LIKE = "SELECT * FROM business_card WHERE NAME LIKE ?";
}
