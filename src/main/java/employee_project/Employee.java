package employee_project;

public class Employee extends Address{

	// Declaring employee variables
	private int empNo;
	private String empName;
	private double salary;
	private Address address;
	
	// Custom constructor
	public Employee(int empNo, String empName, double salary, Address address) {
		super(address.getCity(), address.getState());
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	
	
	@Override
	public String toString() {
		return "Employee ID: " + empNo + "Name: " + empName + "\n";
	}

	// Getter/Setter for Employee ID
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	// Getter/Setter for Employee Name
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// Getter/Setter for Employee Salary
	public double getEmpSalary() {
		return(double) salary;
	}

	// Getter/Setter for Employee Address
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(String city, String state) {
		this.address.city = city;
		this.address.state = state;
	}
	
}




