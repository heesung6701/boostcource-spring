package kr.or.connect.reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.category.CategoryDto;
import kr.or.connect.reservation.dto.category.CategoryListResultDto;
import kr.or.connect.reservation.service.category.CategoryService;

@RestController
@RequestMapping(path = "/api/categories")
public class CategoryController {

  @Autowired
  CategoryService categoryService;

  @GetMapping
  public CategoryListResultDto getCategoryList() {
    List<CategoryDto> categoryList = categoryService.selectAll();
    return new CategoryListResultDto().setSize(categoryList.size()).setItems(categoryList);
  }
}
