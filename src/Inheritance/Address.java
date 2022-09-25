package Inheritance;

public class Address {

	String addressLine;
	String city;
	String zip;

	public Address() {
		super();
	}

	public Address(String addressLine, String city, String zip) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.zip = zip;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
