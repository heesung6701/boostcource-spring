package kr.or.connect.reservation.service.reservationinfo;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
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
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoPriceDto;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoPriceEntity;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddResult;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoDto;
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

    ReservationInfoAddDto reservationInfoDto = new ReservationInfoAddDto()
        .setProductId(1)
        .setDisplayInfoId(1)
        .setReservationYearMonthDay("2020.01.02")
        .setUserId(1)
        .setPrices(Arrays.asList(new ReservationInfoPriceDto().setCount(2).setProductPriceId(3)));
    ReservationInfoAddResult result = reservationInfoService.addReservationInfo(reservationInfoDto);
    Assert.assertEquals(0, result.getCancelFlag());
    Assert.assertEquals(1, result.getPrices().size());
  }
  
  @Test
  public void getListByUserId() throws Exception {
    when(reservationInfoDao.selectByUserId(anyLong())).thenReturn(Arrays.asList(new ReservationInfoEntity(), new ReservationInfoEntity()));
    List<ReservationInfoDto> list = reservationInfoService.getListByUserId(1);
    Assert.assertEquals(2, list.size());
  }

  @Test
  public void removeByReservatoinInfoIdTest() {
    when(reservationInfoPriceDao.deleteByReservationInfoId(anyLong())).thenReturn(1L);
    when(reservationInfoDao.deleteById(anyLong())).thenReturn(1L);

    long reservationInfoId = 99;
    boolean isSuccess = reservationInfoService.removeByReservatoinInfoId(reservationInfoId);
    Assert.assertEquals(true, isSuccess);
  }
}
