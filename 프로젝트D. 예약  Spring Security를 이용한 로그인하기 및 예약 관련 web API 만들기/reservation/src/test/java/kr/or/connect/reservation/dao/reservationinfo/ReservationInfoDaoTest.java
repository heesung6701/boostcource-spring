package kr.or.connect.reservation.dao.reservationinfo;

import java.sql.Connection;
import java.util.Calendar;
import java.util.List;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.entity.reservationinfo.ReservationInfoEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ReservationInfoDaoTest {
  @Autowired
  DataSource dataSource;

  @Autowired
  ReservationInfoDao reservationInfoDao;

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
    Calendar calendar = Calendar.getInstance();
    calendar.set(2020, 1, 2);
    ReservationInfoEntity dummy = new ReservationInfoEntity()
        .setProductId(1)
        .setDisplayInfoId(1)
        .setReservationDate(calendar.getTime())
        .setUserId(1);
    reservationInfoDao.insert(dummy);
  }

  @Test
  public void selectByIdTest() throws Exception {
    ReservationInfoEntity result = reservationInfoDao.selectById(4);
    Assert.assertEquals(2, result.getDisplayInfoId());
    Assert.assertEquals(4, result.getId());
  }
  
  @Test
  public void selectByUserIdTest() throws Exception {
    List<ReservationInfoEntity> result = reservationInfoDao.selectByUserId(4);
    Assert.assertEquals(1, result.size());
    Assert.assertEquals(13000, result.get(0).getSumPrice());
  }
}
