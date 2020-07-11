package kr.or.connect.reservation.dao.user;

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
import kr.or.connect.reservation.dto.user.UserRole;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserRoleDaoTest {

  @Autowired
  DataSource dataSource;

  @Autowired
  UserRoleDao userRoleDao;

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void connectionTest() throws Exception {
    Connection connection = dataSource.getConnection();
    Assert.assertNotNull(connection);
  }

  @Test
  public void getRolesByEmailTest() throws Exception {
    List<UserRole> roles = userRoleDao.getRolesByEmail("carami@connect.co.kr");
    Assert.assertEquals(2, roles.size());
  }
}
