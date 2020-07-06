package kr.or.connect.reservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.PromotionDao;
import kr.or.connect.reservation.dto.PromotionDto;

@Service
public class PromotionServiceImpl implements PromotionService {

  @Autowired
  PromotionDao promotionDao;

  @Override
  public List<PromotionDto> selectAll() {
    return promotionDao.selectAll();
  }
}
