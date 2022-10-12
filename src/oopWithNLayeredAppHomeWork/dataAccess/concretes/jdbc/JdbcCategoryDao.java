package oopWithNLayeredAppHomeWork.dataAccess.concretes.jdbc;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredAppHomeWork.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanina eklendi: " + category.get_name());

	}

}
