package oopWithNLayeredAppHomeWork.entities;

public class Course {

	private int _id;
	private String _name;
	private double _cost;

	public Course(int id, String name, double cost) {

		_id = id;
		_name = name;
		_cost = cost;

	}

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		_id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		_name = name;
	}

	public double get_cost() {
		return _cost;
	}

	public void set_cost(double cost) {
		_cost = cost;
	}
}
