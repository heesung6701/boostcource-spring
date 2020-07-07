package kr.or.connect.reservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.DisplayInfoDao;
import kr.or.connect.reservation.dto.ProductDto;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService{

  @Autowired
  DisplayInfoDao displayInfoDao;
  
  @Override
  public int countByCategoryId(int categoryId) {
    return displayInfoDao.countByCategoryId(categoryId);
  }

  @Override
  public int countAll() {
    return displayInfoDao.countAll();
  }
  
}
