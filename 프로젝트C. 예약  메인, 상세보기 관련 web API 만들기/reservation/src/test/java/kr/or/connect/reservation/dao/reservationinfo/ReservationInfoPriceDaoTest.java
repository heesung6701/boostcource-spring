package kr.or.connect.reservation.dao.reservationinfo;

import java.sql.Connection;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoPriceEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ReservationInfoPriceDaoTest {
  @Autowired
  DataSource dataSource;

  @Autowired
  ReservationInfoPriceDao reservationInfoPriceDao;

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }

  @Test
  public void insertTest() throws Exception {
    ReservationInfoPriceEntity dummy = new ReservationInfoPriceEntity()
        .setReservationInfoId(1)
        .setProductPriceId(1)
        .setCount(1);
    reservationInfoPriceDao.insert(dummy);
  }

  @Test
  public void selectTest() throws Exception {
    List<ReservationInfoPriceEntity> result = reservationInfoPriceDao.selectByReservaionInfoId(4);
    Assert.assertEquals(3, result.size());
  }
}
