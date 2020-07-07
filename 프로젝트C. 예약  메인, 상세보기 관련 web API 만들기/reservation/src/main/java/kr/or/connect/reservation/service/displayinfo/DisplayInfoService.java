package kr.or.connect.reservation.service.displayinfo;

import kr.or.connect.reservation.dto.displayinfo.DisplayInfoResult;

public interface DisplayInfoService {
  public int countByCategoryId(int categoryId);

  public int countAll();

  public DisplayInfoResult get(int displayInfoId);
}
