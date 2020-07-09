package kr.or.connect.reservation.dao.comment;

public class CommentDaoSqls {

  public static final int PAGE_COUNT = 5;
  
  public static final String AVERAGE_SCORE_BY_DISPLAY_INFO_ID =
      "SELECT AVG(c.score) as avg_socre FROM reservation_user_comment c WHERE c.product_id = ( SELECT d.product_id FROM display_info d WHERE d.id = :displayInfoId )";
  
  public static final String SELECT_BY_PRODUCT_ID = 
      "SELECT c.id, c.product_id, c.reservation_info_id, c.score, u.email as reservation_email, c.comment, c.create_date, c.modify_date"
      + " FROM reservation_user_comment c"
      + " LEFT JOIN reservation_info r ON r.id = c.reservation_info_id"
      + " LEFT JOIN user u ON r.user_id = u.id"
      + " WHERE c.product_id = :productId"
      + " LIMIT :start, " + PAGE_COUNT;
}
