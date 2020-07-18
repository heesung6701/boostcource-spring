package kr.or.connect.reservation.dao.reservationinfo;

public class ReservationInfoDaoSqls {

  public static final String SELECT_BY_ID =
      "SELECT ri.id, ri.product_id, ri.display_info_id, ri.user_id, ri.reservation_date, ri.cancel_flag, ri.create_date, ri.modify_date"
          + " FROM RESERVATION_INFO ri "
          + " WHERE ri.id = :id";

  public static final String SELECT_BY_USER_ID =
      "SELECT ri.id, ri.product_id, ri.display_info_id, ri.user_id, ri.reservation_date, ri.cancel_flag, p.description as product_description, p.content as product_content, SUM(pp.price * rip.count) as sum_price, ri.create_date, ri.modify_date"
          + " FROM RESERVATION_INFO ri "
          + " LEFT JOIN PRODUCT p ON p.id = ri.product_id"
          + " LEFT JOIN RESERVATION_INFO_PRICE rip ON rip.reservation_info_id = ri.id"
          + " LEFT JOIN PRODUCT_PRICE pp ON rip.product_price_id = pp.id"
          + " WHERE ri.user_id = :userId"
          + " GROUP BY ri.id";  
}
