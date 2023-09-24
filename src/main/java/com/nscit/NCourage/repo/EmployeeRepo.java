package com.nscit.NCourage.repo;

import com.nscit.NCourage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
