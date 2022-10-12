package oopWithNLayeredAppHomeWork.entities;

public class Category {

	private int _id;
	private String _name;

	public Category(int id, String name) {

		_id = id;
		_name = name;
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

}
