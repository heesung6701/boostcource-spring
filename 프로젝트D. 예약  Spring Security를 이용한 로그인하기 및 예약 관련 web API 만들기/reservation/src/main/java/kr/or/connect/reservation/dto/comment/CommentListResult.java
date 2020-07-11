package kr.or.connect.reservation.dto.comment;

import java.util.List;

public class CommentListResult {
  private int totalCount;
  private int commentCount;
  private List<CommentDto> reservationUserComments;

  public int getTotalCount() {
    return totalCount;
  }

  public CommentListResult setTotalCount(int totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  public int getCommentCount() {
    return commentCount;
  }

  public CommentListResult setCommentCount(int commentCount) {
    this.commentCount = commentCount;
    return this;
  }

  public List<CommentDto> getReservationUserComments() {
    return reservationUserComments;
  }

  public CommentListResult setReservationUserComments(
      List<CommentDto> reservationUserComments) {
    this.reservationUserComments = reservationUserComments;
    return this;
  }

}
