package kr.or.connect.reservation.dao.reservationinfo;

public class ReservationInfoPriceDaoSqls {

  public static final String SELECT_BY_RESERVATION_INFO_ID =
      "SELECT rip.id, rip.reservation_info_id, rip.product_price_id, rip.count"
          + " FROM RESERVATION_INFO_PRICE rip "
          + " WHERE rip.reservation_info_id = :reservationInfoId";

  public static final String DELETE_BY_RESERVATION_INFO_ID = 
      "DELETE FROM RESERVATION_INFO_PRICE"
          + " WHERE reservation_info_id = :reservationInfoId";
}
