package kr.or.connect.reservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.CategoryDao;
import kr.or.connect.reservation.dao.DisplayInfoDao;
import kr.or.connect.reservation.dto.CategoryDto;
import kr.or.connect.reservation.dto.DisplayInfoDto;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService{

  @Autowired
  DisplayInfoDao displayInfoDao;

  @Override
  public List<DisplayInfoDto> selectAll(int start) {
    return displayInfoDao.selectAll(start);
  }

  @Override
  public List<DisplayInfoDto> selectByCategoryId(int categoryId, int start) {
    return displayInfoDao.selectByCategoryId(categoryId, start);
  }

  @Override
  public int countByCategoryId(int categoryId) {
    return displayInfoDao.countByCategoryId(categoryId);
  }
  
}
