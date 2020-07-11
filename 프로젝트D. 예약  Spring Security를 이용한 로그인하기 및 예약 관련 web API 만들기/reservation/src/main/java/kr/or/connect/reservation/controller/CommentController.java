package kr.or.connect.reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kr.or.connect.reservation.dto.comment.CommentDto;
import kr.or.connect.reservation.dto.comment.CommentListResult;
import kr.or.connect.reservation.service.comment.CommentService;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

  @Autowired
  CommentService commentService;

  @GetMapping
  public CommentListResult getCommentList(@RequestParam(defaultValue = "0", required = false) int productId,
      @RequestParam(defaultValue = "0", required = false) int start) {
    List<CommentDto> result = commentService.seletByProductId(productId, start);
    int total = commentService.totalByProductId(productId);
    return new CommentListResult().setTotalCount(total).setCommentCount(result.size())
        .setReservationUserComments(result);
  }
}
