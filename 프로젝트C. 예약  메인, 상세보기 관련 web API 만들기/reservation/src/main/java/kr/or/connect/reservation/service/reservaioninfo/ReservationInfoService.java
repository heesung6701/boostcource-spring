package kr.or.connect.reservation.service.reservaioninfo;

import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;

public interface ReservationInfoService {
  ReservationInfoAddResult addReservationInfo(ReservationInfoAddDto reservationInfoDto);
}
