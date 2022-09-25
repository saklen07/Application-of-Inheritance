package Inheritance;

public class DriverClass {

	public static void main(String[] args) {
		Address address=new Address("Main Road", "Pune", "123456");
		LegalPerson legalPerson=new LegalPerson(7, "Charley", null, 23, address, 7);
		
		System.out.println(legalPerson.toString());
	}

}
