package kr.or.connect.reservation.dao.reservationinfo;

public class ReservationInfoDaoSqls {

  public final static String SELECT_BY_ID =
      "SELECT ri.id, ri.product_id, ri.display_info_id, ri.user_id, ri.reservation_date, ri.cancel_flag, ri.create_date, ri.modify_date"
          + " FROM RESERVATION_INFO ri "
          + " WHERE ri.id = :id";
}
