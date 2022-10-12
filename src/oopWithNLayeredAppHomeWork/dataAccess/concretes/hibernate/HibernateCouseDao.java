package oopWithNLayeredAppHomeWork.dataAccess.concretes.hibernate;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CourseDao;
import oopWithNLayeredAppHomeWork.entities.Course;

public class HibernateCouseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanina eklendi: " + course.get_name());

	}

	

}
