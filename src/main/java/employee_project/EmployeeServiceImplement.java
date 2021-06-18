package employee_project;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeServiceImplement implements EmployeeService {
	
	static ArrayList<Employee> empList =  new ArrayList<Employee>() {
	{
		add(new Employee(1, "Annie", 40000, new Address("Boston", "MA")));
		add(new Employee(2, "Craig", 70000, new Address("Lexington", "KY")));
		add(new Employee(3, "Mike", 75000, new Address("New Brunswick", "NJ")));
		add(new Employee(4, "Jose", 70000, new Address("Miami", "FL")));
		add(new Employee(5, "Eric", 90000, new Address("Mexico City", "NA")));
		add(new Employee(6, "Choi", 100000, new Address("Seoul", "NA")));
		add(new Employee(7, "Crystal", 50000, new Address("Miami", "FL")));
		add(new Employee(8, "Hyeri", 45000, new Address("Busan", "NA")));
		add(new Employee(9, "Ingyu", 85000, new Address("Anyang", "NA")));
		add(new Employee(10, "Jason", 50000, new Address("New York", "NY")));
	}
};

	
	// IMPLEMENTATION //

	// Display all employees
	public void displayAllEmployees() {

		for(int i = 0; i >= empList.size(); i++) {
		    System.out.println(empList.get(i));
		}
		
		System.out.println(empList);
	}

	
	// Find employee by ID
	public int findByEmployeeNo(int empNo) {
		
		empList.stream()
		.filter(e -> e.getEmpNo() == empNo).collect(Collectors.toList());
		
		return empNo;
	}
	
	// Display salary of one employee by ID
	public double calculateYearlySalary(Employee e1) {
		Employee es = new Employee();
		
		double annualSalary = es.getEmpSalary() * 12;
		return annualSalary;
	}
	
	public void updateEmployee(Employee e1) {

	}

	// Delete an employee
	public void deleteEmployee(Employee e1) {
		empList.remove(e1);
	}



}
