package Inheritance;

import java.sql.Date;

public class LegalPerson extends NaturalPerson{
	
	Integer numberOfEmployees;

	public LegalPerson() {
		super();
	}

	
	public LegalPerson(Integer id, String name, Date dateOfBirth, Integer age, Address address,
			Integer numberOfEmployees) {
		super(id, name, dateOfBirth, age, address);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public String toString() {
		return "LegalPerson [numberOfEmployees=" + numberOfEmployees + ", id=" + id + ", name=" + name
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", address=" + address + ", getNumberOfEmployees()="
				+ getNumberOfEmployees() + ", getId()=" + getId() + ", getName()=" + getName() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
