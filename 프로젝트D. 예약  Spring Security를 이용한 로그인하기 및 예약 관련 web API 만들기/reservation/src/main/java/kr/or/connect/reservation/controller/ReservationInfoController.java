package kr.or.connect.reservation.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoResult;
import kr.or.connect.reservation.dto.user.User;
import kr.or.connect.reservation.service.reservaioninfo.ReservationInfoService;
import kr.or.connect.reservation.service.user.UserService;

@RestController
@RequestMapping(path = "/api/reservationInfos")
public class ReservationInfoController {

  @Autowired
  ReservationInfoService reservationInfoService;
  
  @Autowired
  UserService userService;
  
  @PostMapping
  @ResponseBody
  public ReservationInfoAddResult addRsercationInfo(@RequestBody ReservationInfoAddDto reservationInfoAddDto) {
    return reservationInfoService.addReservationInfo(reservationInfoAddDto);
  }
  
  @GetMapping
  @ResponseBody
  public ReservationInfoResult getByUserId(Principal principal) {
    String userEmail = principal.getName();
    User user = userService.getUserByEmail(userEmail);
    long userId = user.getId();
    List<ReservationInfoDto> reservationInfos = reservationInfoService.getListByUserId(userId);
    return new ReservationInfoResult()
        .setSize(reservationInfos.size())
        .setItems(reservationInfos);
  }
  
  @PutMapping
  @ResponseBody
  public Map<String, String> removeByReservationnInfoId(@RequestBody Map<String, String> reqBody){
    long reservationInfoId = Long.parseLong(reqBody.get("id"));
    boolean result = reservationInfoService.removeByReservatoinInfoId(reservationInfoId);
    HashMap<String, String> map = new HashMap<>();
    map.put("success", result ? "success" : "fail");
    return map;
  }
}
