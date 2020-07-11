package kr.or.connect.reservation.dao.comment;

public class CommentImageDaoSqls {

  public static final String SELECT_BY_COMMENT_ID =
      "SELECT c.id as comment_id, img.id as comment_image_id, f.content_type as type, f.id as file_info_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date"
      + " FROM reservation_user_comment_image img"
      + " LEFT JOIN reservation_user_comment c ON img.reservation_user_comment_id = c.id"
      + " LEFT JOIN file_info f ON img.file_id = f.id"
      + " WHERE img.reservation_user_comment_id = :commentId";
}