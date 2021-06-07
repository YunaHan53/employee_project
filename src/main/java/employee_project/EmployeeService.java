package employee_project;

public interface EmployeeService {

	// Declaration
	void displayAllEmployees();
    void calculateYearlySalary(int calcSalary);
    void findByEmployeeNo(int findEmpNo);
    void updateEmployee(String updateEmp);
    void deleteEmployee();
}
