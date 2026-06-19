package com.KD.Employee.EmpRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.KD.Employee.EmpModel.Employee;

public interface empRepo extends JpaRepository<Employee, Long> {
}
