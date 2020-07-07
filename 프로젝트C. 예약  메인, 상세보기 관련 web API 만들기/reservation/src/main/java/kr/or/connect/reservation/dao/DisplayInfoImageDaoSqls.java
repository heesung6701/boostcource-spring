package kr.or.connect.reservation.dao;

public class DisplayInfoImageDaoSqls {

  public static final String SELECT_BY_DISPLAY_INFO_ID =
      "SELECT di.id, di.display_info_id, f.id as file_id, f.file_name, f.save_file_name, f.content_type, f.delete_flag, f.create_date, f.modify_date"
          + " FROM display_info d" + " LEFT JOIN display_info_image di ON di.display_info_id = d.id"
          + " LEFT JOIN file_info f ON f.id = di.file_id" + " WHERE d.id = :displayInfoId";
}
