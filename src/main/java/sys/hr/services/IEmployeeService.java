package sys.hr.services;

import sys.hr.models.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> listEmployees();

    public Employee searchEmployeeById(Integer employeeId);

    public Employee saveEmployee(Employee employee);

    public void deleteEmployee(Employee employee);
}
