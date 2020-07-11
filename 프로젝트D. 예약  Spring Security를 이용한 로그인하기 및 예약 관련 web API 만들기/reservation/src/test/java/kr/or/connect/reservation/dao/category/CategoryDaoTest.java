package kr.or.connect.reservation.dao.category;

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
import kr.or.connect.reservation.dao.category.CategoryDao;
import kr.or.connect.reservation.dto.category.CategoryDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CategoryDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  CategoryDao categoryDao;
  
  @Test
  public void configTest() throws Exception{
    
  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }
  
  @Test
  public void getCategory() throws Exception {
    List<CategoryDto> categoryList = categoryDao.selectAll();
    Assert.assertNotNull(categoryList);
    Assert.assertEquals(5, categoryList.size());
  }
}
