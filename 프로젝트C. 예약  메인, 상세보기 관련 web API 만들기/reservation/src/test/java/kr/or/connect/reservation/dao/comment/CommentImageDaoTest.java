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
import kr.or.connect.reservation.dto.comment.CommentImageDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CommentImageDaoTest {

  @Autowired
  DataSource dataSource;
  
  @Autowired
  CommentImageDao commentImageDao;
  
  @Test
  public void configTest() throws Exception{
    
  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }

  @Test
  public void selectByProductIdTest() throws Exception {
    List<CommentImageDto> commentImages = commentImageDao.selectByCommentId(1);
    Assert.assertNotNull(commentImages);
    Assert.assertEquals(1, commentImages.size());
  }
}
