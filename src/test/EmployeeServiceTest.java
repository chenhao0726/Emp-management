package test;

import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import com.chen.service.impl.EmployeeServiceImpl;
import org.junit.Test;

import java.util.List;

public class EmployeeServiceTest {
    private IEmployeeService iEmployeeService = new EmployeeServiceImpl();

    @Test
    public void selectAllTest() {
        List<Employee> employeeList = iEmployeeService.selectAll();
        employeeList.forEach(System.out::println);
    }

    @Test
    public void selectByIdTest() {
        Employee employee = iEmployeeService.selectById(2L);
        System.out.println(employee);
    }
}
