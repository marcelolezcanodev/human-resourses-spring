package sys.hr.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sys.hr.models.Employee;
import sys.hr.services.EmployeeService;

import java.util.List;

@RestController
//http://localhost:8080/hr-app/
@RequestMapping("hr-app")
@CrossOrigin(value = "http://localhost:3000")
public class EmployeeController {
    private static final Logger logger =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/empleados")
    public List<Employee> getEmployees(){
        var employees = employeeService.listEmployees();
        employees.forEach((employee -> logger.info(employee.toString())));
        return employees;
    }

    @PostMapping("/empleados")
    public Employee addEmployee(@RequestBody Employee employee){
        logger.info("Empleado a agregar: " + employee);
        return employeeService.saveEmployee(employee);
    }
}
