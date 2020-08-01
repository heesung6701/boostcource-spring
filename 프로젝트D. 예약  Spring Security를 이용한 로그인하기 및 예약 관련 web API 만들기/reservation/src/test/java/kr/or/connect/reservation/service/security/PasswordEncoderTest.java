package kr.or.connect.reservation.service.security;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.config.SecurityConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class, SecurityConfig.class})
public class PasswordEncoderTest {
  @Autowired
  PasswordEncoder passwordEncoder;

  @Test
  public void passwordEncodeTest() throws Exception {
    String result = passwordEncoder.encode("1234");
    System.out.println(result);
    Assert.assertTrue(result.matches("1234"));
  }

  @Test
  public void passwordTest() throws Exception {
    String encodedPasswd = "$2a$10$USbExG2YOZJqu5rR9eWAqO3NqwjS6c8uI0c695cnURA2gxqRnx41O";
    String password = "1234";
    boolean test = passwordEncoder.matches(password, encodedPasswd);
    Assert.assertTrue(test);
  }

}
