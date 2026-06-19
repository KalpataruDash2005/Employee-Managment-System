package com.KD.Employee.EmpController;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.KD.Employee.EmpModel.Employee;
import com.KD.Employee.EmpService.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController {

    private final EmpService service;

    public EmpController(EmpService service) {
        this.service = service;
    }

    // Create Employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.addEmp(employee);
    }

    // Get All Employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmp();
    }


    // Delete Employee
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return service.deleteEmp(id);
    }
}
