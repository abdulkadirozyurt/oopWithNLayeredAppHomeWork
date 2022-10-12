package oopWithNLayeredAppHomeWork.business.concretes;

import oopWithNLayeredAppHomeWork.business.abstracts.CourseService;
import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;
import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CourseDao;
import oopWithNLayeredAppHomeWork.entities.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	private Course[] courses;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Course[] courses, Logger[] loggers) {

		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {

		for (int i = 0; i < courses.length; i++) {
			if (course.get_name() == courses[i].get_name()) {
				throw new Exception("Kurs zaten mevcut");

			}
			if (course.get_cost()<0) {
				throw new Exception("Kurs ucreti sifirdan kucuk olamaz.");
			}

		}

		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.get_name());
		}

	}

}
