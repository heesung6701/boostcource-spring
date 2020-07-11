package kr.or.connect.reservation.dao.displayinfo;

import java.sql.Connection;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dao.displayinfo.DisplayInfoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class DisplayInfoDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  DisplayInfoDao displayInfoDao;
  
  @Test
  public void configTest() throws Exception{
    
  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }
  
  @Test
  public void countDisplayInfoByCategoryIdTest() throws Exception {
    int result = displayInfoDao.countByCategoryId(3);
    Assert.assertEquals(16, result);
  }

  @Test
  public void countDisplayInfoAllTest() throws Exception {
    int result = displayInfoDao.countAll();
    Assert.assertTrue(result > 0);
  }
}
