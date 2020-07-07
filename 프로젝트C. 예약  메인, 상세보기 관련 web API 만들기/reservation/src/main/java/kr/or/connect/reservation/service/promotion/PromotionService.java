package kr.or.connect.reservation.service.promotion;

import java.util.List;
import kr.or.connect.reservation.dto.promotion.PromotionDto;

public interface PromotionService {
  public List<PromotionDto> selectAll();
}
