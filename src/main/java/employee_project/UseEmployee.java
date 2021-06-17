package employee_project;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;


public class UseEmployee {
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
	public static Scanner input = new Scanner(System.in);

	// Main
	public static void main(String[] args) {
	
		int inputNum = 0;
		boolean exit = true;
		
		EmployeeServiceImplement runner = new EmployeeServiceImplement();
		
		
		do {
			System.out.println("Welcome to Employees Information System\n");
			System.out.println("Employee Menu, please input a number to select\n"
					+ "1. Display all employees\n"
					+ "2. Find employee by employee ID\n"
					+ "3. Display an employee's yearly salary\n"
					+ "4. Delete an employee\n"
					+ "5. Quit");
			
			inputNum = input.nextInt();
			
			
			switch(inputNum) {
			// Display all employees
			case(1):
				runner.displayAllEmployees();
				System.out.println();
				break;
			
			// Find employee by ID
			case(2):
				System.out.println("Find inputed employee ID:");
				int empId = input.nextInt();
	
				int empIdNum = runner.findByEmployeeNo(empId);
			
				System.out.println("Employee with ID #" + empIdNum + " is " + empName  );
				break;
			
			// Display salary of one employee by ID
			case(3):
				System.out.println("Enter the employee ID for the employee that you're calculating their yearly salary for:");
				empId = input.nextInt();
				
				empIdNum = runner.findByEmployeeNo(empId);
				
				System.out.println("Employee with ID #" + empIdNum + " is " + Employee.getEmpName() + " with annual salary of " + Employee.getEmpSalary() );
				break;

			// Delete an employee
			case(4):
				runner.deleteEmployee(EmployeeServiceImplement.empList.get(empIdNum));
				LOGGER.log(Level.WARNING, "Employee deleted.");
				break;
			
			// Exit
			case(5): exit = false;
				input.close();
				System.exit(0);
				break;
				
			}
			
		}
		while(exit);
		
		System.out.println("Thank You! Goodbye.");

	}

}
