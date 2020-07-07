package kr.or.connect.reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.ProductDto;
import kr.or.connect.reservation.dto.DisplayInfoListResult;
import kr.or.connect.reservation.dto.DisplayInfoResult;
import kr.or.connect.reservation.service.DisplayInfoService;
import kr.or.connect.reservation.service.ProductService;

@RestController
@RequestMapping(path = "/api/displayinfos")
public class DisplayInfoController {

  @Autowired
  DisplayInfoService displayInfoSerice;

  @Autowired
  ProductService productService;

  @GetMapping
  public DisplayInfoListResult getDisplayInfoList(@RequestParam(defaultValue = "0") int categoryId,
      @RequestParam(defaultValue = "0") int start) {

    int totalCount = categoryId == 0 ? displayInfoSerice.countAll()
        : displayInfoSerice.countByCategoryId(categoryId);
    List<ProductDto> list = categoryId == 0 ? productService.selectAll(start)
        : productService.selectByCategoryId(categoryId, start);

    return new DisplayInfoListResult().setTotalCount(totalCount).setProductCount(list.size())
        .setProducts(list);
  }

  @GetMapping("/{displayId}")
  public DisplayInfoResult getDisplayInfo(@PathVariable("displayId") int displayInfoId) {
    return displayInfoSerice.get(displayInfoId);
  }
}
