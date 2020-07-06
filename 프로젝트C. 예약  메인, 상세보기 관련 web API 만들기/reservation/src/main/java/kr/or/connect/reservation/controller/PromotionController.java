package kr.or.connect.reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.PromotionDto;
import kr.or.connect.reservation.dto.PromotionListResult;
import kr.or.connect.reservation.service.PromotionService;

@RestController
@RequestMapping(path = "/api/promotions")
public class PromotionController {

  @Autowired
  PromotionService promotionService;

  @GetMapping
  public PromotionListResult getPromotionList() {
    List<PromotionDto> result = promotionService.selectAll();
    return new PromotionListResult().setSize(result.size()).setItems(result);
  }
}
