package employee_project;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;


public class UseEmployee {
	
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
	public static Scanner input = new Scanner(System.in);

	// Main
	public static void main(String[] args) {
		// Create new instances
		EmployeeServiceImplement runner = new EmployeeServiceImplement();
		Employee e1 = new Employee();

		int inputNum = 0;
		boolean exit = true;
		

		// Print EIS Introduction
		System.out.println("/*** Welcome to the Employee Information System ***/ \n");

		// Loop through the menu and user choices
		do {
			System.out.println("/*** Employee Menu, please input a number to select ***/ \n"
					+ "1. Display all employees\n"
					+ "2. Add new employee\n"
					+ "3. Find employee by employee ID\n"
					+ "4. Update an employee\n"
					+ "5. Display an employee's monthly salary\n"
					+ "6. Delete an employee\n"
					+ "7. Quit");
			
			inputNum = input.nextInt();
			
			
			switch(inputNum) {
			// Display all employees
			case(1):
				runner.displayAllEmployees();
				System.out.println();
				break;
		
			// Add a new employee
			case(2):
				runner.addEmployee();
				break;
					
			// Find employee by ID
			case(3):
				System.out.println("Please enter employee ID to get their info:\n");
				int empId = input.nextInt();
	
				e1 = runner.findByEmployeeNo(empId);
				
			
				System.out.println("This employee's name is " + e1.getEmpName() + " located in " + e1.getAddress() + ".\n");
				break;

			// Update an employee
			case(4):
				System.out.println("Enter the employee ID you want to update:\n");
				empId = input.nextInt();
	
				e1 = runner.findByEmployeeNo(empId);
				
				runner.updateEmployee(e1);
				
				break;
					
			// Display salary of one employee by ID
			case(5):
				System.out.println("Enter the employee ID to get their name and salary:\n");
				empId = input.nextInt();

				e1 = runner.findByEmployeeNo(empId);
				
				System.out.println("Employee with ID #" + empId + " is " + e1.getEmpName() + " with a monthly salary of $" + e1.getEmpSalary() + ".\n" );
				break;

			// Delete an employee
			case(6):
				System.out.println("Enter the employee ID that you want to delete:\n");
				empId = input.nextInt();
				
				e1 = runner.findByEmployeeNo(empId);
				
				runner.deleteEmployee(e1);
				
				LOGGER.log(Level.WARNING, "Employee deleted.\n");
				break;
			
			// Exit
			case(7): exit = false;
				System.out.println("Thank You! Goodbye.");
				System.exit(0);
				break;
				
			}
			
		}
		while(exit);
		
		input.close();
	}
	

}
