package employee_project;

import java.util.ArrayList;


public class EmployeeServiceImplement implements EmployeeService {
	
	public static ArrayList<Employee> empList =  new ArrayList<Employee>() {

		private static final long serialVersionUID = 1L;

	{
		add(new Employee(1, "Annie", 4000, new Address("Boston", "MA")));
		add(new Employee(2, "Craig", 7000, new Address("Lexington", "KY")));
		add(new Employee(3, "Mike", 7500, new Address("New Brunswick", "NJ")));
		add(new Employee(4, "Jose", 7000, new Address("Miami", "FL")));
		add(new Employee(5, "Eric", 9000, new Address("Mexico City", "NA")));
		add(new Employee(6, "Choi", 5500, new Address("Seoul", "NA")));
		add(new Employee(7, "Crystal", 5000, new Address("Miami", "FL")));
		add(new Employee(8, "Hyeri", 4500, new Address("Busan", "NA")));
		add(new Employee(9, "Ingyu", 8500, new Address("Anyang", "NA")));
		add(new Employee(10, "Jason", 5000, new Address("New York", "NY")));
	}
};

	
	// IMPLEMENTATION //

	// Display all employees
	public void displayAllEmployees() {

		for(int i = 0; i >= empList.size(); i++) {
		    System.out.println(empList.get(i));
		}
		
		System.out.println(empList.toString());
	}

	
	// Find employee by ID
	public Employee findByEmployeeNo(int empNo) {
		
		Employee e1 = empList.stream().filter(e -> e.getEmpNo() == empNo).findFirst().orElse(null);
	
		return e1;
	}
	
	// Display salary of one employee by ID
	public double calculateYearlySalary(Employee e1) {
		
		double annualSalary = e1.getEmpSalary() * 12;
		return annualSalary;
	}
	
	public void updateEmployee(Employee e1) {

	}

	// Delete an employee
	public void deleteEmployee(Employee e1) {
		empList.remove(e1);
	}



}
