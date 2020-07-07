package kr.or.connect.reservation.dao;

public class ProductImageDalSqls {

  public static final String SELECT_BY_DISPLAY_INFO_ID =
      "SELECT pi.product_id, pi.id as product_image_id, pi.type, pi.file_id as file_info_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date"
          + " FROM display_info d" + " LEFT JOIN product_image pi ON d.product_id = pi.product_id"
          + " LEFT JOIN file_info f ON f.id = pi.file_id"
          + " WHERE d.id = :displayInfoId AND pi.type = 'ma'";
}
