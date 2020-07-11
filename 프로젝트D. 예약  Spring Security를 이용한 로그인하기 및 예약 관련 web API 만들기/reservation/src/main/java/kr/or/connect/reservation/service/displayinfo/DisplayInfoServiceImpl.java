package kr.or.connect.reservation.service.displayinfo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.comment.CommentDao;
import kr.or.connect.reservation.dao.displayinfo.DisplayInfoDao;
import kr.or.connect.reservation.dao.displayinfo.DisplayInfoImageDao;
import kr.or.connect.reservation.dao.product.ProductDao;
import kr.or.connect.reservation.dao.product.ProductImageDao;
import kr.or.connect.reservation.dao.product.ProductPriceDao;
import kr.or.connect.reservation.dto.displayinfo.DisplayInfoImageDto;
import kr.or.connect.reservation.dto.displayinfo.DisplayInfoResult;
import kr.or.connect.reservation.dto.product.ProductDto;
import kr.or.connect.reservation.dto.product.ProductImageDto;
import kr.or.connect.reservation.dto.product.ProductPriceDto;

@Service
public class DisplayInfoServiceImpl implements DisplayInfoService {

  @Autowired
  DisplayInfoDao displayInfoDao;

  @Autowired
  ProductDao productDao;

  @Autowired
  ProductImageDao productImageDao;

  @Autowired
  DisplayInfoImageDao displayInfoImageDao;

  @Autowired
  CommentDao commentDao;

  @Autowired
  ProductPriceDao productPriceDao;


  @Override
  public int countByCategoryId(int categoryId) {
    return displayInfoDao.countByCategoryId(categoryId);
  }

  @Override
  public int countAll() {
    return displayInfoDao.countAll();
  }

  @Override
  public DisplayInfoResult get(int displayInfoId) {
    ProductDto product = productDao.select(displayInfoId);
    List<ProductImageDto> productImages = productImageDao.selectList(displayInfoId);
    List<DisplayInfoImageDto> displayInfoImages =
        displayInfoImageDao.selectByDisplayInfoId(displayInfoId);
    int avgScore = commentDao.getAverageScoreByDisplayInfoId(displayInfoId);
    List<ProductPriceDto> productPrices = productPriceDao.selectByDisplayInfoId(displayInfoId);

    return new DisplayInfoResult().setProduct(product).setProductIamges(productImages)
        .setDisplayInfoImages(displayInfoImages).setAvgScore(avgScore)
        .setProductPrices(productPrices);
  }
}
