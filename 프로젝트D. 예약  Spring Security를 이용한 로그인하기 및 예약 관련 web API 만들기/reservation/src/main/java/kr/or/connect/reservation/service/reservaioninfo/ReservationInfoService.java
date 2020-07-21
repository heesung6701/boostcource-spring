package kr.or.connect.reservation.service.reservaioninfo;

import java.util.List;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoEntity;

public interface ReservationInfoService {
  ReservationInfoAddResult addReservationInfo(ReservationInfoAddDto reservationInfoDto);
  List<ReservationInfoDto> getListByUserId(long userId);
}
