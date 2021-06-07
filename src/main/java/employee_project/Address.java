package employee_project;

public class Address {

	private String city;
	private String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	
	@Override
	public String toString() {
		return "Address: " + city + ", " + state;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
