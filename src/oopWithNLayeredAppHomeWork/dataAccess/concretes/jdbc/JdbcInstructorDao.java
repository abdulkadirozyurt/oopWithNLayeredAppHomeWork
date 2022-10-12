package oopWithNLayeredAppHomeWork.dataAccess.concretes.jdbc;

import oopWithNLayeredAppHomeWork.dataAccess.abstracts.InstructorDao;
import oopWithNLayeredAppHomeWork.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanina eklendi: " + instructor.get_firstName() +" "+ instructor.get_lastName());

	}

}
