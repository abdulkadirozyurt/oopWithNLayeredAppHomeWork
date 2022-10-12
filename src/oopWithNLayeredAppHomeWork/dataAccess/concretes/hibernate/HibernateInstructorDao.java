package oopWithNLayeredAppHomeWork.dataAccess.concretes.hibernate;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredAppHomeWork.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {

		System.out.println(
				"Hibernate ile veritabanina eklendi: " + instructor.get_firstName() +" "+ instructor.get_lastName());

	}

}
