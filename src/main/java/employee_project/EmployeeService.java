package employee_project;

public interface EmployeeService {

	// Declaration
	public void displayAllEmployees();
    public double calculateYearlySalary(Employee e1);
    public int findByEmployeeNo(int empNo);
    public void updateEmployee(Employee e1);
    public void deleteEmployee(Employee e1);
}
