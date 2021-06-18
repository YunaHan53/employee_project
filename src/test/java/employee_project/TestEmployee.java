package employee_project;

import org.junit.Test;


public class TestEmployee extends EmployeeServiceImplement{
	
	@Test
	public void testSalary() {
		Employee e1 = new Employee(10, "Yuna", 4000, new Address("Boston", "MA"));
		double salary = calculateYearlySalary(e1);
		System.out.println(salary);
	}
}
