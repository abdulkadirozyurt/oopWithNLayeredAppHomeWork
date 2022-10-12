package oopWithNLayeredAppHomeWork;

import oopWithNLayeredAppHomeWork.business.concretes.CategoryManager;
import oopWithNLayeredAppHomeWork.business.concretes.CourseManager;
import oopWithNLayeredAppHomeWork.business.concretes.InstructorManager;
import oopWithNLayeredAppHomeWork.core.logging.abstracts.Logger;
import oopWithNLayeredAppHomeWork.core.logging.concretes.DatabaseLogger;
import oopWithNLayeredAppHomeWork.core.logging.concretes.FileLogger;
import oopWithNLayeredAppHomeWork.core.logging.concretes.MailLogger;
import oopWithNLayeredAppHomeWork.dataAccess.concretes.hibernate.HibernateCategoryDao;
import oopWithNLayeredAppHomeWork.dataAccess.concretes.hibernate.HibernateCouseDao;
import oopWithNLayeredAppHomeWork.dataAccess.concretes.jdbc.JdbcInstructorDao;
import oopWithNLayeredAppHomeWork.entities.Category;
import oopWithNLayeredAppHomeWork.entities.Course;
import oopWithNLayeredAppHomeWork.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Category category1 = new Category(1, "Web Programlama");
		Category category2 = new Category(2, "Algoritma");
		Category category3 = new Category(3, "Veritabani");

		Category[] categories = { category1, category2, category3 };
		

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);
		categoryManager.add(new Category(3, "Siber Guvenlik"));

		System.out.println("------------------------------------------------");

		Course course1 = new Course(1, "JavaScript", 69.90);
		Course course2 = new Course(2, "C# ", 69.90);
		Course course3 = new Course(3, "Java", 69.90);
		Course course4 = new Course(4, "C++", 79.90);

		Course[] courses = { course1, course2, course3, course4 };

		CourseManager courseManager = new CourseManager(new HibernateCouseDao(), courses, loggers);
		courseManager.add(new Course(5, "C", 9));

		System.out.println("------------------------------------------------");

		Instructor instructor1 = new Instructor(1, "Abdulkadir", "Ozyurt", 5);

		Instructor[] instructors = { instructor1 };

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), instructors, loggers);
		instructorManager.add(instructor1);

	}

}
