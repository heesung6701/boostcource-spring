package kr.or.connect.reservation.service.comment;

import java.util.List;
import kr.or.connect.reservation.dto.comment.CommentDto;

public interface CommentService {

  public int totalByProductId(int productId);

  public List<CommentDto> seletByProductId(int productId, int start);
}
