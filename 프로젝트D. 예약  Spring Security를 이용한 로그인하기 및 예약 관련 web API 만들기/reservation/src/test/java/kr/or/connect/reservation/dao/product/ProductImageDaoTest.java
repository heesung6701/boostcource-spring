package kr.or.connect.reservation.dao.product;

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
import kr.or.connect.reservation.dao.product.ProductImageDao;
import kr.or.connect.reservation.dto.product.ProductImageDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ProductImageDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  ProductImageDao productImageDao;
  
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
    List<ProductImageDto> result = productImageDao.selectList(1);
    Assert.assertNotNull(result);
    Assert.assertEquals(1, result.size());
  }
}
