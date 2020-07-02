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
import kr.or.connect.reservation.dto.CategoryDto;
import kr.or.connect.reservation.dto.DisplayInfoDto;

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
  public void getDisplayInfoAllTest() throws Exception {
    List<DisplayInfoDto> displayInfoList = displayInfoDao.selectAll(0);
    Assert.assertNotNull(displayInfoList);
    Assert.assertTrue(displayInfoList.size() > 0);
  }

  @Test
  public void getDisplayInfoAllWithStartTest() throws Exception {
    List<DisplayInfoDto> displayInfoList = displayInfoDao.selectAll(57);
    Assert.assertNotNull(displayInfoList);
    Assert.assertEquals(2, displayInfoList.size());
  }

  @Test
  public void getDisplayInfoByCategoryIdTest() throws Exception {
    List<DisplayInfoDto> displayInfoList = displayInfoDao.selectByCategoryId(3, 0);
    Assert.assertNotNull(displayInfoList);
    Assert.assertTrue(displayInfoList.size() > 0);
    Assert.assertEquals(0, displayInfoList.stream().filter(it -> it.getCategoryId() != 3).count());
  }

  @Test
  public void countDisplayInfoByCategoryIdTest() throws Exception {
    int result = displayInfoDao.countByCategoryId(3);
    Assert.assertEquals(16, result);
  }
}
