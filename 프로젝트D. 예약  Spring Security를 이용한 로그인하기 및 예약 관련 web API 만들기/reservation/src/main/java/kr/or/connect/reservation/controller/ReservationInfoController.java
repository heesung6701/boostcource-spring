package kr.or.connect.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;
import kr.or.connect.reservation.service.reservaioninfo.ReservationInfoService;

@RestController
@RequestMapping(path = "/api/reservationInfos")
public class ReservationInfoController {

  @Autowired
  ReservationInfoService reservationInfoService;
  
  @PostMapping
  @ResponseBody
  public ReservationInfoAddResult addRsercationInfo(@RequestBody ReservationInfoAddDto reservationInfoAddDto) {
    return reservationInfoService.addReservationInfo(reservationInfoAddDto);
  }
}
