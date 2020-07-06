package kr.or.connect.reservation.service;

import java.util.List;
import kr.or.connect.reservation.dto.PromotionDto;

public interface PromotionService {
  public List<PromotionDto> selectAll();
}
