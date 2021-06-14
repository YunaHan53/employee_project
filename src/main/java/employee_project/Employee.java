package employee_project;

public class Employee {

	// Declaring employee variables
	private int empNo;
	private static String empName;
	private double salary;
	private static Address address;
	
	// Custom constructor
	public Employee(int empNo, String empName, double salary, Address address) {
		super();
		this.empNo = empNo;
		Employee.empName = empName;
		this.salary = salary;
		this.address = address;
	}


	// Getter/Setter for Employee ID
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	// Getter/Setter for Employee Name
	public static String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		Employee.empName = empName;
	}
	
	
	// Getter/Setter for Employee Salary
	public double getEmpSalary() {
		return salary;
	}
	public void setEmpSalary(double salary) {
		this.salary = salary;
	}
	
	// Getter/Setter for Employee Address	
	public static Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + empNo + " Name: " + empName + "\n";
	}
	
}




