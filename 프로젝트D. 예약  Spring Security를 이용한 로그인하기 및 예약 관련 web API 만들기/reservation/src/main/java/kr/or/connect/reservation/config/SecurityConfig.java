package kr.or.connect.reservation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import kr.or.connect.reservation.service.security.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  CustomUserDetailsService customUserDetailService;

  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/webjars/**");
  }
  
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(customUserDetailService);
  }
  
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
    .csrf().disable()
    .authorizeRequests()
    .antMatchers("/", "/auth/loginerror", "/user/joinform", "/user/join").permitAll()
    .antMatchers("/api/**").hasRole("USER")
    .anyRequest().authenticated()
    .and()
      .formLogin()
      .loginPage("/auth/loginform")
      .usernameParameter("userId")
      .passwordParameter("password")
      .loginProcessingUrl("/authenticate")
      .failureForwardUrl("/auth/loginerror?login_error=1")
      .defaultSuccessUrl("/user/userform", true)
      .permitAll()
    .and()
      .logout()
      .logoutUrl("/auth/logout")
      .logoutSuccessUrl("/");
  }

  @Bean
  public PasswordEncoder encoder() {
      return new BCryptPasswordEncoder();
  }
}
