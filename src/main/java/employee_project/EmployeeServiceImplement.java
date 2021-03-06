package employee_project;

import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeServiceImplement implements EmployeeService {
	
	public static Scanner input = new Scanner(System.in);
	
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

	// Add an employee
	public void addEmployee() {
		System.out.println("Employee ID");
		int newID= input.nextInt();
		
		System.out.println("Employee Name: ");
		String name = input.next();
		
		System.out.println("Employee Monthly Earnings: ");
		double salary = input.nextDouble();
		
		System.out.println("Employee City ");
		String city = input.next();
		
		System.out.println("Employee State ");
		String state = input.next();
		
		empList.add(new Employee(newID, name, salary, new Address(city,state)));
		System.out.println("Employee created");
		System.out.println(empList);
		
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
	
	// Update an Employee
	public void updateEmployee(Employee e1) {
		
		int choice = input.nextInt();
		update(choice);
		
	}

	// Delete an employee
	public void deleteEmployee(Employee e1) {
		empList.remove(e1);
	}


	// Update Employee Choices
	public void update(int empNo) {
		
		System.out.println("Please enter what you would like to change");
		System.out.println("1. Employee Name");
		System.out.println("2. Employee Salary");
		System.out.println("3. Employee Address");
		int cha=input.nextInt();
		
		switch(cha) {
		case 1:
			
			System.out.println("Enter your name change");
			String name = input.next();
			findByEmployeeNo(empNo).setEmpName(name);
			System.out.println("New Employee Name " + findByEmployeeNo(empNo).getEmpName());
			System.out.println(empList);
			break;
		case 2:
			double salary=input.nextDouble();
			findByEmployeeNo(empNo).setEmpSalary(salary);
			System.out.println("New Employee Salary " + findByEmployeeNo(empNo).getEmpSalary());
			System.out.println(empList);
			break;
		case 3:
			System.out.println("Enter a City for new address");
			String city= input.next();
			System.out.println("Enter a State for new address");
			String state= input.next();
			
			findByEmployeeNo(empNo).setAddress(new Address(city,state));
			System.out.println("The employee's Address is now set to: " + findByEmployeeNo(empNo).getAddress().getCity() + ", " + findByEmployeeNo(empNo).getAddress().getState());
			
			System.out.println(empList);
			break;
			default:
				System.out.println("Command not recognized");
		}
	}


}
