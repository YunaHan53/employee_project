package employee_project;

public interface EmployeeService {

	// Declaration
	public void displayAllEmployees();
    public double calculateYearlySalary(Employee e1);
    public Employee findByEmployeeNo(int empNo);
    public void updateEmployee(Employee e1);
    public void deleteEmployee();
}
