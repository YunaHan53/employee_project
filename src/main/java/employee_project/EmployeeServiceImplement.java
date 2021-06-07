package employee_project;

import java.util.*;
import java.util.ArrayList;

public abstract class EmployeeServiceImplement implements EmployeeService {

	double wagePerHour = 15.50;
	
	static ArrayList<Employee> empList =  new ArrayList<Employee>();

	
	public static void main(String[] args) {
				
		empList.add(new Employee(100, "Annie", 40000, null));
		empList.add(new Employee(200, "Craig", 70000, null));
		empList.add(new Employee(300, "Mike", 75000, null));
		empList.add(new Employee(400, "Jose", 70000, null));
		empList.add(new Employee(500, "Eric", 90000, null));
		empList.add(new Employee(600, "Choi", 100000, null));
		empList.add(new Employee(700, "Crystal", 50000, null));
		empList.add(new Employee(800, "Hyeri", 45000, null));
		empList.add(new Employee(900, "Minsu", 85000, null));
		empList.add(new Employee(1000, "Jason", 50000, null));

	}
	
	// implementation
	public void displayAllEmployee() {
		System.out.println(empList);

	}
	public void calculateYearlySalary(double calcSalary) {
		calcSalary = wagePerHour * 40 * 52;
	}
	public void findByEmployeeNo(int findEmpNo) {

	}
	public void updateEmployee(String updateEmp) {

	}
	public void deleteEmployee() {

	}


}
