package kr.or.connect.reservation.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import kr.or.connect.reservation.config.ApplicationConfig;
import kr.or.connect.reservation.config.MvcConfig;
import kr.or.connect.reservation.config.SecurityConfig;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoAddDto;
import kr.or.connect.reservation.dto.reservationinfo.ReservationInfoPriceDto;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {ApplicationConfig.class, MvcConfig.class, SecurityConfig.class})
public class ReservationInfoControllerTest {

  @Autowired
  ReservationInfoController reservationInfoController;

  private MockMvc mockMvc;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(reservationInfoController).build();
  }

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void addReservationInfoTest() throws Exception {
    ReservationInfoAddDto reservationInfoDto = new ReservationInfoAddDto()
        .setProductId(1)
        .setDisplayInfoId(1)
        .setReservationYearMonthDay("2020.01.02")
        .setUserId(1)
        .setPrices(Arrays.asList(new ReservationInfoPriceDto().setCount(2).setProductPriceId(3)));
    mockMvc.perform(post("/api/reservationInfos", reservationInfoDto)).andExpect(status().isOk());
  }
}
