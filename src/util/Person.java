package util;

public class Person {

	private String _name, _surname;

	public Person(String name, String surname) {
		_name = name;
		_surname = surname;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		this._surname = surname;
	}

	@Override
	public String toString() {
		return "Name: " + _name + " Surname: " + _surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int _hashSequence = 1;
		_hashSequence = prime * _hashSequence + ((_name == null) ? 0 : _name.hashCode());
		_hashSequence = prime * _hashSequence + ((_surname == null) ? 0 : _surname.hashCode());
		return _hashSequence;
	}

	@Override
	public boolean equals(Object obj) {
		return hashCode() == obj.hashCode();
	}

}
