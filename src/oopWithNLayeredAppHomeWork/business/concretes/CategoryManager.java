package oopWithNLayeredAppHomeWork.business.concretes;

import oopWithNLayeredAppHomeWork.business.abstracts.CategoryService;
import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;
import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CategoryDao;
import oopWithNLayeredAppHomeWork.entities.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private Category[] categories;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Category[] categories, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {

		for (int i = 0; i < categories.length; i++) {

			if (category.get_name() == categories[i].get_name()) {

				throw new Exception("Kategori ismi zaten mevcut");
			}	
			

		}
		
		categoryDao.add(category);
		
		

		for (Logger logger : loggers) {
			logger.log(category.get_name());
		}
	}

}
