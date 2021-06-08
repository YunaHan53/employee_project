package employee_project;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;


public class UseEmployee {
	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());

	public static void main(String[] args) {
	
		int inputNum = 0;
		
		EmployeeServiceImplement runner = new EmployeeServiceImplement();
		
		System.out.println("Welcome to Employees Information System\n");
		
		Scanner input = new Scanner(System.in);
				
		while(inputNum != 5) {
			
			System.out.println("Employee Menu, please input a number to select\n"
					+ "1. Display all employees\n"
					+ "2. Find employee by employee ID\n"
					+ "3. Calculate an employee's yearly salary\n"
					+ "4. Delete an employee\n"
					+ "5. Quit");
			inputNum = input.nextInt();
		
			switch(inputNum) {
			case(1):
				runner.displayAllEmployees();
				System.out.println();
				break;
				
			case(2):
				System.out.println("Find inputed employee ID:");
				int empId = input.nextInt();
	
				Employee empIdNum = runner.findByEmployeeNo(empId);
			
				System.out.println(runner.findByEmployeeNo(empId) + " " + runner.findByEmployeeNo(empId).getAddress());			
				break;
				
			case(3):
				System.out.println("Enter the employee ID for the employee that you're calculating their yearly salary for:");
				empId = input.nextInt();

				
			case(4):
				runner.deleteEmployee();
				LOGGER.log(Level.WARNING, "Employee deleted, ensure authenticity");
				break;
				
			case(5):
				input.close();
				System.out.println("Thank You! Goodbye.");
				System.exit(0);
				
			}
			break;
		}

	}

}
