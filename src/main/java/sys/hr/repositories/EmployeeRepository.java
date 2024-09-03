package sys.hr.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import sys.hr.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
