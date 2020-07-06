package kr.or.connect.reservation.dao;

public class DisplayInfoDaoSqls {
  public static final int PAGE_COUNT = 4;
  
  public static final String SELECT_ALL = 
      "SELECT d.id, p.category_id, dii.display_info_id, c.name, p.description, p.content, p.event,"
      + "d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, dii.file_id"
      + " FROM display_info d"
      + " LEFT JOIN product p ON d.product_id = p.id"
      + " LEFT JOIN display_info_image dii ON dii.display_info_id = d.id"
      + " LEFT JOIN category c ON c.id = p.category_id"
      + " LIMIT :start, " + PAGE_COUNT;

  public static final String SELECT_BY_CATEGORY_ID = 
      "SELECT d.id, p.category_id, dii.display_info_id, c.name, p.description, p.content, p.event,"
      + " d.opening_hours, d.place_name, d.place_lot, d.place_street, d.tel, d.homepage, d.email, d.create_date, d.modify_date, dii.file_id"
      + " FROM display_info d"
      + " LEFT JOIN product p ON d.product_id = p.id"
      + " LEFT JOIN display_info_image dii ON dii.display_info_id = d.id"
      + " LEFT JOIN category c ON c.id = p.category_id"
      + " WHERE p.category_id = :categoryId"
      + " LIMIT :start, " + PAGE_COUNT;;
  
  public static final String COUNT_BY_CATEGORY_ID = 
      "SELECT count(*) "
      + " FROM display_info d"
      + " LEFT JOIN product p ON d.product_id = p.id"
      + " WHERE p.category_id = :categoryId";

  public static final String COUNT_ALL = 
      "SELECT count(*) "
      + " FROM display_info d"
      + " LEFT JOIN product p ON d.product_id = p.id";
}