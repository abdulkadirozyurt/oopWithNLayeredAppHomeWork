package oopWithNLayeredAppHomeWork.business.concretes;

import oopWithNLayeredAppHomeWork.business.abstracts.InstructorService;
import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;
import oopWithNLayeredAppHomeWork.dataAccess.abstracts.CourseDao;
import oopWithNLayeredAppHomeWork.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredAppHomeWork.entities.Instructor;

public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private Instructor[] instructors;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Instructor[] instructors, Logger[] loggers) {

		this.instructorDao = instructorDao;
		this.instructors = instructors;
		this.loggers = loggers;
	}

	@Override
	public void add(Instructor instructor) throws Exception {

		for (int i = 0; i < instructors.length; i++) {
			if (instructor.get_numberOfcourses() > 5) {
				throw new Exception("Bir egitmen en fazla 5 kurs verebilir.");
			}
		}

		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.get_firstName() + " " + instructor.get_lastName());
		}

	}

}
