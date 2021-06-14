package employee_project;

import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class EmployeeServiceImplement implements EmployeeService {

	private static final Logger LOGGER = Logger.getLogger(UseEmployee.class.getName());
	
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

	
	// implementation

	public static Logger getLogger() {
		return LOGGER;
	}

	public void displayAllEmployees() {
		// TODO Auto-generated method stub
		for(int i = 0; i >= empList.size(); i++) {
		    System.out.println(empList.get(i));
		}
		
		System.out.println(empList);
	}
	
	public double calculateYearlySalary(Employee e1) {

		double calcSalary = e1.getEmpSalary() * 40 * 52;
		return calcSalary;
	}
	
	public int findByEmployeeNo(int empNo) {
		
		empList.stream()
		.filter(e -> e.getEmpNo() == empNo).collect(Collectors.toList());
		
		return empNo;
	}
	
	public void updateEmployee(Employee e1) {

	}

	public void deleteEmployee() {
		// TODO Auto-generated method stub
	}


}
