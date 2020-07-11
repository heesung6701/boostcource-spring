package kr.or.connect.reservation.service.comment;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.connect.reservation.dao.comment.CommentDao;
import kr.or.connect.reservation.dao.comment.CommentImageDao;
import kr.or.connect.reservation.dto.comment.CommentDto;
import kr.or.connect.reservation.dto.comment.CommentImageDto;

@Service
public class CommentServiceImpl implements CommentService {

  @Autowired
  CommentDao commentDao;

  @Autowired
  CommentImageDao commentImageDao;

  public List<CommentDto> seletByProductId(int productId, int start) {
    return commentDao.selectByProductId(productId, start).stream().map(it -> {
      List<CommentImageDto> images = commentImageDao.selectByCommentId(it.getId());
      return it.setReservationUserCommentImages(images);
    }).collect(Collectors.toList());
  }

  @Override
  public int totalByProductId(int productId) {
    return commentDao.getCountByProductId(productId);
  }
}
