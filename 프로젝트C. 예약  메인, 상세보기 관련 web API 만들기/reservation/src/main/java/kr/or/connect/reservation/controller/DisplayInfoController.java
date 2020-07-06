package kr.or.connect.reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.DisplayInfoDto;
import kr.or.connect.reservation.dto.DisplayInfoListResult;
import kr.or.connect.reservation.service.DisplayInfoService;

@RestController
@RequestMapping(path = "/api/displayinfos")
public class DisplayInfoController {

  @Autowired
  DisplayInfoService displayInfoSerice;

  @GetMapping
  public DisplayInfoListResult getDisplayInfoList(@RequestParam(defaultValue = "0") int categoryId,
      @RequestParam(defaultValue = "0") int start) {

    int totalCount = categoryId == 0 ? displayInfoSerice.countAll() 
        : displayInfoSerice.countByCategoryId(categoryId);
    List<DisplayInfoDto> list = categoryId == 0 ? displayInfoSerice.selectAll(start)
        : displayInfoSerice.selectByCategoryId(categoryId, start);
    
    return new DisplayInfoListResult()
        .setTotalCount(totalCount)
        .setProductCount(list.size())
        .setProducts(list);
  }
}
