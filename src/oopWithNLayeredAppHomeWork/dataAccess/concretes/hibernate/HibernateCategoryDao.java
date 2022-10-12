package oopWithNLayeredAppHomeWork.dataAccess.concretes.hibernate;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredAppHomeWork.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanina eklendi: "+category.get_name());
		
	}

	

}
