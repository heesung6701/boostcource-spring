package kr.or.connect.reservation.dao.comment;

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
import kr.or.connect.reservation.dto.comment.CommentDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CommentDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  CommentDao commentDao;
  
  @Test
  public void configTest() throws Exception{
    
  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }
  
  @Test
  public void getAverageScoreByDisplayInfoIdTest() throws Exception {
    int score = commentDao.getAverageScoreByDisplayInfoId(1);
    Assert.assertNotNull(score);
    Assert.assertEquals(3, score);
  }

  @Test
  public void getTotalByProductId() throws Exception {
    int total = commentDao.getCountByProductId(1);
    Assert.assertNotNull(total);
    Assert.assertEquals(15, total);
    
  }
  
  
  @Test
  public void selectByProductIdTest() throws Exception {
    List<CommentDto> comments = commentDao.selectByProductId(1, 0);
    Assert.assertNotNull(comments);
    Assert.assertEquals(5, comments.size());
  }
}
