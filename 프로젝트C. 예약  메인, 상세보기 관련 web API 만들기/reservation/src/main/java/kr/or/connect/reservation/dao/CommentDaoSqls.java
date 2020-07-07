package kr.or.connect.reservation.dao;

public class CommentDaoSqls {

  public static final String AVERAGE_SCORE_BY_DISPLAY_INFO_ID =
      "SELECT AVG(c.score) as avg_socre FROM reservation_user_comment c WHERE c.product_id = ( SELECT d.product_id FROM display_info d WHERE d.id = :displayInfoId )";
}
