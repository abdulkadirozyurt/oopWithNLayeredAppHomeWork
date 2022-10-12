package oopWithNLayeredAppHomeWork.dataAccess.concretes.jdbc;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CourseDao;
import oopWithNLayeredAppHomeWork.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile veritabanina eklendi: " + course.get_name());
		
	}

}
