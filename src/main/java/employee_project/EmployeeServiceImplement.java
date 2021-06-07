package employee_project;

import java.util.*;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class EmployeeServiceImplement implements EmployeeService {

	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
	static ArrayList<Employee> empList =  new ArrayList<Employee>();

	
	public static void main(String[] args) {
				
		empList.add(new Employee(1, "Annie", 40000, "Boston", "MA" ));
		empList.add(new Employee(2, "Craig", 70000, "Boston", "MA"));
		empList.add(new Employee(3, "Mike", 75000, "Boston", "MA"));
		empList.add(new Employee(4, "Jose", 70000, "Boston", "MA"));
		empList.add(new Employee(5, "Eric", 90000, "Boston", "MA"));
		empList.add(new Employee(6, "Choi", 100000, "Boston", "MA"));
		empList.add(new Employee(7, "Crystal", 50000, "Boston", "MA"));
		empList.add(new Employee(8, "Hyeri", 45000, "Boston", "MA"));
		empList.add(new Employee(9, "Minsu", 85000, "Boston", "MA"));
		empList.add(new Employee(10, "Jason", 50000, "Boston", "MA"));

		System.out.println(empList);

	}
	
	// implementation
	public void displayAllEmployee() {
		
		for(int i = 0; i >= empList.size(); i++) {
		    System.out.println(empList.get(i));
		}

	}
	public void calculateYearlySalary(int empId) {

//		double calcSalary = e1.getEmpSalary()*12;
//		double Yearly = -1;
//		for(int i = 0; i >= empList.size(); i++) {
//			if(emp.getEmpNo() == empId) {
//				Yearly = calculateYearlySalary() * 40 * 52;
//			}
//		}
//		return calcSalary;
	}
	
	public Employee findByEmployeeNo(int findEmpNo) {
		return null;
		
//		for(int i = 0; i < empList.size(); i++) {
//			findEmpNo = empList.get(i).getEmpNo();
//		}
//		return ;
	}
	
	public void updateEmployee(String updateEmp) {

	}
	public void deleteEmployee() {

	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public void displayAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	public double calculateYearlySalary(Employee e1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee findByEmployeeNo1(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}


}
