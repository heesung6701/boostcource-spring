package kr.or.connect.reservation.service;

import java.util.List;
import kr.or.connect.reservation.dto.DisplayInfoDto;

public interface DisplayInfoService {
  public List<DisplayInfoDto> selectAll(int start);
  public List<DisplayInfoDto> selectByCategoryId(int categoryId, int start);
  public int countByCategoryId(int categoryId);
}
