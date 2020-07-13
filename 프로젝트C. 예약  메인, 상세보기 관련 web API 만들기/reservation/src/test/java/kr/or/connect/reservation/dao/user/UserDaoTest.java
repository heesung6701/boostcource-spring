package kr.or.connect.reservation.dao.user;

import java.sql.Connection;
import javax.sql.DataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dto.user.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserDaoTest {

  @Autowired
  DataSource dataSource;

  @Autowired
  UserDao userDao;

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }

  @Test
  public void getUserByEmailTest() throws Exception {
    User user = userDao.getUserByEmail("hong@connect.co.kr");
    Assert.assertEquals("홍길동", user.getName());
  }

  @Test(expected = DuplicateKeyException.class)
  public void addUserTest() throws Exception {
    User dummyUser = new User().setEmail("heesung6701@naver.com").setName("윤희성").setPhone("01020813818")
        .setPassword("$2a$10$USbExG2YOZJqu5rR9eWAqO3NqwjS6c8uI0c695cnURA2gxqRnx41O");
    userDao.addUser(dummyUser);
  }
}
