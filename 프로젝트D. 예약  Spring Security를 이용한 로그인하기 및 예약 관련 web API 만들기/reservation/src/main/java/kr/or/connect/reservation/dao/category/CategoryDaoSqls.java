package kr.or.connect.reservation.dao.category;

public class CategoryDaoSqls {
  public static final String SELECT_ALL = 
      "SELECT c.id, c.name, (select count(*) from product p where c.id = p.category_id) as count from category c";
}
