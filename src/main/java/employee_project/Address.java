package employee_project;

public class Address {

	protected String city;
	protected String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	// Getters/Setters
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

	@Override
	public String toString() {
		return "Address: " + city + ", " + state;
	}
}
