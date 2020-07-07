package kr.or.connect.reservation.dao.displayinfo;

public class DisplayInfoDaoSqls {

  public static final String COUNT_BY_CATEGORY_ID = "SELECT count(*) " + " FROM display_info d"
      + " LEFT JOIN product p ON d.product_id = p.id" + " WHERE p.category_id = :categoryId";

  public static final String COUNT_ALL =
      "SELECT count(*) " + " FROM display_info d" + " LEFT JOIN product p ON d.product_id = p.id";
}
