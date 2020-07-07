package kr.or.connect.reservation.dao;

public class ProductPriceDaoSqls {

  public static final String SELECT_BY_DISPLAY_INFO_ID =
      "SELECT pp.id, pp.product_id, pp.price_type_name, pp.price, pp.discount_rate, pp.create_date, pp.modify_date"
          + " FROM product_price pp"
          + " WHERE pp.product_id = ( SELECT d.product_id from display_info d WHERE d.id = :displayInfoId )";
}
