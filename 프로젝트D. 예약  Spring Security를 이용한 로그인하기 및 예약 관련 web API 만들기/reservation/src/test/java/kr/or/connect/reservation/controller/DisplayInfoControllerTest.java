package kr.or.connect.reservation.controller;

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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {ApplicationConfig.class, MvcConfig.class})
public class DisplayInfoControllerTest {

  @Autowired
  DisplayInfoController displayInfoController;

  private MockMvc mockMvc;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(displayInfoController).build();
  }

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void getDisplayInfoTest() throws Exception {
    mockMvc.perform(get("/api/displayinfos/1")).andExpect(status().isOk());
  }
}
