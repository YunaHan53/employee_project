package employee_project;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.Scanner;

public class UseEmployee {

	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());

	public static void main(String[] args) {
	
		EmployeeServiceImplement esi = new EmployeeServiceImplement();
		
		System.out.println("Welcome to Employees Information System\n");
		
		Scanner input = new Scanner(System.in);
		
		int inputNum = 0;
		
		while(true) {
			System.out.println("Employee Menu, please input a number to select\n"
					+ "1. Display all employees\n"
					+ "2. Find employee by employee ID\n"
					+ "3. Calculate an employee's yearly salary\n"
					+ "4. Delete an employee\n"
					+ "5. Quit");
			
			switch(inputNum) {
			case(1):
				esi.displayAllEmployees();
				System.out.println();
				break;
				
			case(2):
//				System.out.println("Find inputed employee ID:");
//				int empId = input.nextInt();
//				
//				Employee empIdNum = esi.findByEmployeeNo(empId);
//				
//				if(empIdNum = null) {
//					System.out.println("There is no employee with this ID, please try again. ID: " + empId);
//				} else {
//					System.out.println("Employee ID found: " + empId + "Name: " + esi.findByEmployeeNo(empId).toString());
//				}
//				
//				break;
				
			case(3):
//				System.out.println("Enter the employee ID for the employee that you're calculating their yearly salary for:");
//				empId = input.nextInt();
//				double salary = esi.calculateYearlySalary(empId);
//				if(salary == -1) {
//					System.out.println("Sorry there was no employee with the ID Number: " + empId);
//				}else {
//					System.out.println("The salary for Employee: " + esi.findByEmployeeNo(empId).getEmpName() + " is: " + salary +"$ per year");
//				}
//				break;
				
			case(4):
				esi.deleteEmployee();
			LOGGER.log(Level.WARNING, "Employee deleted, ensure authenticity");
				break;
				
			case(5):
				input.close();
				System.out.println("Thank You! Goodbye.");
				System.exit(0);
				
			}
		}

	}

}
