package oopWithNLayeredAppHomeWork.entities;

public class Instructor {

	private int _id;
	private String _firstName;
	private String _lastName;
	private int _numberOfcourses;

	public Instructor(int id, String firstName, String lastName, int numberOfCourses) {

		_id = id;
		_firstName = firstName;
		_lastName = lastName;
		_numberOfcourses = numberOfCourses;

	}

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		_id = id;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String firstName) {
		_firstName = firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String lastName) {
		_lastName = lastName;
	}

	public int get_numberOfcourses() {
		return _numberOfcourses;
	}

	public void set_numberOfcourses(int numberOfcourses) {
		this._numberOfcourses = numberOfcourses;
	}

}
