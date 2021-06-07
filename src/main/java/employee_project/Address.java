package employee_project;

public class Address {

	protected static String city;
	protected static String state;
	
	public Address(String city, String state) {
		super();
		Address.city = city;
		Address.state = state;
	}
	
	
	@Override
	public String toString() {
		return "Address: " + city + ", " + state;
	}

	public String getCity() {
		return Address.city;
	}
	public void setCity(String city) {
		Address.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		Address.state = state;
	}

}
