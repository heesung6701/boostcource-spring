package kr.or.connect.reservation.controller;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoResult;
import kr.or.connect.reservation.service.reservaioninfo.ReservationInfoService;

@RestController
@RequestMapping(path = "/api/reservationInfos")
public class ReservationInfoController {

  @Autowired
  ReservationInfoService reservationInfoService;
  
  @PostMapping
  @ResponseBody
  public ReservationInfoResult addRsercationInfo(@RequestBody ReservationInfoDto reservationInfoDto) throws ParseException {
    ReservationInfoResult result = reservationInfoService.addReservationInfo(reservationInfoDto);
    return result;
  }
}
