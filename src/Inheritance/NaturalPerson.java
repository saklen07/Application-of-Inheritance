package Inheritance;

import java.util.Date;

public class NaturalPerson {

	Integer id;
	String name;
	Date dateOfBirth;
	Integer age;
	Address address;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(Integer id, String name, Date dateOfBirth, Integer age, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "NaturalPerson [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", age=" + age
				+ ", address=" + address + ", getId()=" + getId() + ", getName()=" + getName() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
