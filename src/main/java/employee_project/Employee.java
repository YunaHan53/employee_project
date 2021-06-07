package employee_project;

public class Employee {

	// Declaring employee variables
	private int empNo;
	private String empName;
	double salary;
	private String address;
	
	// Custom constructor
	public Employee(int empNo, String empName, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee(Employee employee) {
		
		this.empNo = employee.empNo;
		this.empName = employee.empName;
	}
	
	
	@Override
	public String toString() {
		return "Employee ID: " + empNo + "\n" + "Name: " + empName + "\n";
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
	
	// Getter/Setter for Employee Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String city, String state) {
		this.address = address;
	}
}




