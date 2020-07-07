package kr.or.connect.reservation.service;

import kr.or.connect.reservation.dto.DisplayInfoResult;

public interface DisplayInfoService {
  public int countByCategoryId(int categoryId);
  public int countAll();
  public DisplayInfoResult get(int displayInfoId);
}
