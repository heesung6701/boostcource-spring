package kr.or.connect.reservation.service.reservaioninfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDao;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoPriceDao;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoEntity;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoPriceEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;

@Service
public class ReservationInfoServiceImpl implements ReservationInfoService{
  
  @Autowired
  ReservationInfoDao reservationInfoDao;

  @Autowired
  ReservationInfoPriceDao reservationInfoPriceDao;
  
  @Override
  public ReservationInfoAddResult addReservationInfo(ReservationInfoAddDto reservationInfoDto) {
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
    return new ReservationInfoAddResult()
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
