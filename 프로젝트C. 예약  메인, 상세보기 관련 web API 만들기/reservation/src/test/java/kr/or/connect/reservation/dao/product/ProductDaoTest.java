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
import kr.or.connect.reservation.dao.product.ProductDao;
import kr.or.connect.reservation.dto.product.ProductDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class ProductDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  ProductDao productDao;
  
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
    List<ProductDto> displayInfoList = productDao.selectAll(0);
    Assert.assertNotNull(displayInfoList);
    Assert.assertTrue(displayInfoList.size() > 0);
  }

  @Test
  public void getDisplayInfoAllWithStartTest() throws Exception {
    List<ProductDto> displayInfoList = productDao.selectAll(57);
    Assert.assertNotNull(displayInfoList);
    Assert.assertEquals(2, displayInfoList.size());
  }

  @Test
  public void getDisplayInfoByCategoryIdTest() throws Exception {
    List<ProductDto> productList = productDao.selectByCategoryId(3, 0);
    Assert.assertNotNull(productList);
    Assert.assertTrue(productList.size() > 0);
    Assert.assertEquals(0, productList.stream().filter(it -> it.getCategoryId() != 3).count());
  }

  @Test
  public void getDisplayInfoByIdTest() throws Exception {
    ProductDto product = productDao.select(1);
    Assert.assertNotNull(product);
    Assert.assertEquals("전시", product.getName());
  }
}
