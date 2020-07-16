package kr.or.connect.reservation.service.reservaioninfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDao;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoPriceDao;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoPriceEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoResult;

@Service
public class ReservationInfoServiceImpl implements ReservationInfoService{
  
  @Autowired
  ReservationInfoDao reservationInfoDao;

  @Autowired
  ReservationInfoPriceDao reservationInfoPriceDao;
  
  @Override
  public ReservationInfoResult addReservationInfo(ReservationInfoDto reservationInfoDto) {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY.MM.DD");
    Date date;
    try {
      date = simpleDateFormat.parse(reservationInfoDto.getReservationYearMonthDay()); 
    } catch(ParseException e) {
      e.printStackTrace();
       return null;
    }
    long id = reservationInfoDao.insert(new ReservationInfoEntity()
        .setDisplayInfoId(reservationInfoDto.getDisplayInfoId())
        .setProductId(reservationInfoDto.getProductId())
        .setUserId(reservationInfoDto.getUserId())
        .setReservationDate(date));
    reservationInfoDto.getPrices().stream().forEach(it -> {
      reservationInfoPriceDao.insert(new ReservationInfoPriceEntity()
          .setReservationInfoId((int)id)
          .setCount(it.getCount())
          .setProductPriceId(it.getProductPriceId()));
    });
    ReservationInfoEntity reservationInfoEntity = reservationInfoDao.selectById(id);
    List<ReservationInfoPriceEntity> priceEntities = reservationInfoPriceDao.selectByReservaionInfoId(id);
    return new ReservationInfoResult()
        .setId(reservationInfoEntity.getId())
        .setDisplayInfoId(reservationInfoEntity.getDisplayInfoId())
        .setProductPriceId(reservationInfoEntity.getProductId())
        .setUserId(reservationInfoEntity.getUserId())
        .setReservationDate(reservationInfoEntity.getReservationDate().getTime())
        .setCancelFlag(reservationInfoEntity.getCancelFlag())
        .setCreateDate(reservationInfoEntity.getCreateDate().getTime())
        .setModifyDate(reservationInfoEntity.getModifyDate().getTime())
        .setPrices(priceEntities);
  }
}
