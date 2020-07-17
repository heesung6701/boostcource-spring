package kr.or.connect.reservation.dao.reservationinfo;

public class ReservationInfoPriceDaoSqls {

  public final static String SELECT_BY_RESERVATION_INFO_ID =
      "SELECT rip.id, rip.reservation_info_id, rip.product_price_id, rip.count"
          + " FROM RESERVATION_INFO_PRICE rip "
          + " WHERE rip.reservation_info_id = :reservation_info_id";
}
