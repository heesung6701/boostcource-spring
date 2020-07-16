package kr.or.connect.reservation.service.reservationinfo;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoDao;
import kr.or.connect.reservation.dao.reservationinfo.ReservationInfoPriceDao;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoPriceDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoPriceEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoResult;
import kr.or.connect.reservation.service.reservaioninfo.ReservationInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ReservaionInfoServiceTest {

  @Mock
  private ReservationInfoDao reservationInfoDao;

  @Mock
  private ReservationInfoPriceDao reservationInfoPriceDao;

  @Autowired
  @InjectMocks
  private ReservationInfoService reservationInfoService;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void configTest() throws Exception {}

  @Test
  public void addReservationInfoTest() throws Exception {
    when(reservationInfoDao.insert(any(ReservationInfoEntity.class))).thenReturn(4L);
    when(reservationInfoDao.selectById(anyInt())).thenReturn(new ReservationInfoEntity()
        .setProductId(2)
        .setDisplayInfoId(2)
        .setReservationDate(Calendar.getInstance().getTime())
        .setUserId(1));
    when(reservationInfoPriceDao.insert(any(ReservationInfoPriceEntity.class))).thenReturn(1L);
    when(reservationInfoPriceDao.selectByReservaionInfoId(anyInt())).thenReturn(
        Arrays.asList(new ReservationInfoPriceEntity().setId(21).setCount(2).setProductPriceId(3).setReservationInfoId(17)));

    ReservationInfoDto reservationInfoDto = new ReservationInfoDto()
        .setProductId(1)
        .setDisplayInfoId(1)
        .setReservationYearMonthDay("2020.01.02")
        .setUserId(1)
        .setPrices(Arrays.asList(new ReservationInfoPriceDto().setCount(2).setProductPriceId(3)));
    ReservationInfoResult result = reservationInfoService.addReservationInfo(reservationInfoDto);
    Assert.assertEquals(0, result.getCancelFlag());
    Assert.assertEquals(1, result.getPrices().size());
  }
}
