package com.nscit.NCourage.service;

import com.nscit.NCourage.entity.Employee;
import com.nscit.NCourage.exception.ResourceNotFoundException;
import com.nscit.NCourage.repo.EmployeeRepo;
import com.nscit.NCourage.repo.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ManagerRepo managerRepo;
    @Override
    public Employee createEmployee(Employee employee) {
        Employee save = employeeRepo.save(employee);
        return save;
    }


}
