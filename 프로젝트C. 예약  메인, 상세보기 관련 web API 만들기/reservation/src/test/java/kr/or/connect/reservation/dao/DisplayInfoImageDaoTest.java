package kr.or.connect.reservation.dao;

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
import kr.or.connect.reservation.dto.DisplayInfoImageDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class DisplayInfoImageDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  DisplayInfoImageDao displayInfoImageDao;
  
  @Test
  public void configTest() throws Exception{
    
  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }
  
  @Test
  public void getByIdTest() throws Exception {
    List<DisplayInfoImageDto> result = displayInfoImageDao.selectByDisplayInfoId(1);
    Assert.assertNotNull(result);
    Assert.assertEquals(1, result.size());
  }
}
