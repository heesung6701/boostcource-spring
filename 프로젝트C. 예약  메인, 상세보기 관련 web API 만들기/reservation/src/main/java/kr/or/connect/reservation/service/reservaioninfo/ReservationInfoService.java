package kr.or.connect.reservation.service.reservaioninfo;

import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoResult;

public interface ReservationInfoService {
  ReservationInfoResult addReservationInfo(ReservationInfoDto reservationInfoDto);
}
