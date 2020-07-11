package kr.or.connect.reservation.dao.promotion;

public class PromotionDaoSqls {

  public static final String SELECT_ALL =
      "SELECT pm.id, pm.product_id, p.category_id, c.name as category_name, p.description, pi.file_id"
          + " FROM promotion pm" + " LEFT JOIN product p ON p.id = pm.product_id"
          + " LEFT JOIN product_image pi ON pi.product_id = pm.product_id"
          + " LEFT JOIN category c ON c.id = p.category_id" + " WHERE pi.type = 'th'";
}
