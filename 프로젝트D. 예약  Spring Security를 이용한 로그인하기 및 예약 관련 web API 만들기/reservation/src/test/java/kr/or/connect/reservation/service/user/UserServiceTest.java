package kr.or.connect.reservation.service.user;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.dao.user.UserDao;
import kr.or.connect.reservation.dao.user.UserRoleDao;
import kr.or.connect.reservation.dto.user.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserServiceTest {

  @Mock
  private UserDao userDao;

  @Mock
  private UserRoleDao userRoleDao;

  @Autowired
  @InjectMocks
  private UserService userService;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void configTest() throws Exception {}

  @Test
  public void addUserTest() throws Exception {
    when(userDao.addUser(any())).thenReturn(0L);
    User dummyUser = mock(User.class);
    userService.addUser(dummyUser);
  }

  @Test
  public void getUserByEmailTest() throws Exception {
    when(userDao.getUserByEmail(anyString())).thenReturn(new User().setName("테스트"));
    User user = userService.getUserByEmail("carami@connect.co.kr");
    Assert.assertEquals("테스트", user.getName());
  }
}
