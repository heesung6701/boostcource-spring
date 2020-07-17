package kr.or.connect.reservation.service.security;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;
import java.util.List;
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
import kr.or.connect.reservation.dto.user.UserRole;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class UserDbServiceTest {

  @Mock
  private UserDao userDao;

  @Mock
  private UserRoleDao userRoleDao;

  @Autowired
  @InjectMocks
  private UserDbService userDbService;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void configTest() throws Exception {}

  @Test
  public void getUserTest() throws Exception {
    when(userDao.getUserByEmail(anyString()))
        .thenReturn(new User().setEmail("heesung6701@naver.com").setPassword("1234"));
    UserEntity userEntity = userDbService.getUser("test");
    Assert.assertEquals("heesung6701@naver.com", userEntity.getLoginUserId());
    Assert.assertEquals("1234", userEntity.getPassword());
  }

  @Test
  public void getUserRolesTest() throws Exception {
    when(userRoleDao.getRolesByEmail(anyString()))
        .thenReturn(List.of(new UserRole().setRoleName("USER")));
    List<UserRoleEntity> roleEntities = userDbService.getUserRoles("heesung6701");
    Assert.assertEquals("USER", roleEntities.get(0).getRoleName());
  }
}
