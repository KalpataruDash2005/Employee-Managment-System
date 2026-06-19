package com.KD.Employee.EmpService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.KD.Employee.EmpModel.Employee;
import com.KD.Employee.EmpRepo.empRepo;

@Service
public class EmpService {

    private final empRepo repo;

    public EmpService(empRepo repo) {
        this.repo = repo;
    }

    public Employee addEmp(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmp() {
        return repo.findAll();
    }

    public String deleteEmp(Long id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}
