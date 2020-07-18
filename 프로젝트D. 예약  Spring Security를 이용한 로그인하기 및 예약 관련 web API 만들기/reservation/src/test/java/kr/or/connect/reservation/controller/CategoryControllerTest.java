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
import kr.or.connect.reservation.config.SecurityConfig;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {ApplicationConfig.class, MvcConfig.class, SecurityConfig.class})
public class CategoryControllerTest {

  @Autowired
  CategoryController categoryController;

  private MockMvc mockMvc;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(categoryController).build();
  }

  @Test
  public void configTest() throws Exception {

  }

  @Test
  public void getCategoryListTest() throws Exception {
    mockMvc.perform(get("/api/categories")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=0")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=0&start=0")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=0&start=5")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=3&start=0")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=5&start=0")).andExpect(status().isOk());
    mockMvc.perform(get("/api/categories?categoryId=8&start=5")).andExpect(status().isOk());
  }
}
