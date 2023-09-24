package com.nscit.NCourage.service;

import com.nscit.NCourage.entity.Employee;
import com.nscit.NCourage.entity.Manager;
import com.nscit.NCourage.exception.ResourceNotFoundException;
import com.nscit.NCourage.repo.EmployeeRepo;
import com.nscit.NCourage.repo.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepo managerRepo;
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Manager addManager(Manager manager) {
        Manager save = managerRepo.save(manager);
        return save;
    }


    public Employee addPointsToEmployee(int empId, int points, int manId) {
        Employee employee = employeeRepo.findById(empId).
                orElseThrow(() -> new ResourceNotFoundException("user not found with given id " + empId));

        Manager manager = managerRepo.findById(manId).
                orElseThrow(() -> new ResourceNotFoundException("user not found with given id " + manId));

        int managerPoints = manager.getPoints();
        if (managerPoints > points) {
            int managerRemainingPoints = managerPoints - points;
            manager.setPoints(managerRemainingPoints);
            this.managerRepo.save(manager);

            employee.setTotalPoints(points);
            employeeRepo.save(employee);
            int totalPoints = employee.getTotalPoints();

            if (totalPoints >= 300 && totalPoints < 500) {
                employee.setBadge("copper");
                employeeRepo.save(employee);
            } else if (totalPoints >= 500 && totalPoints < 750) {
                employee.setBadge("Bronze");
                employeeRepo.save(employee);
            } else if (totalPoints >= 750 && totalPoints < 1000) {
                employee.setBadge("copper");
                employeeRepo.save(employee);
            } else if (totalPoints >= 1000 && totalPoints < 1250) {
                // Award Silver Badge
                employee.setBadge("Silver");
                employeeRepo.save(employee);

            } else if (totalPoints >= 1250 && totalPoints < 1500) {
                employee.setBadge("Crystal");
                employeeRepo.save(employee);

            } else if (totalPoints >= 1500 && totalPoints < 1750) {
                employee.setBadge("Pearl");
                employeeRepo.save(employee);

            } else if (totalPoints >= 1750 && totalPoints < 2000) {
                employee.setBadge("Jade");
                employeeRepo.save(employee);

            } else if (totalPoints >= 2000 && totalPoints < 2250) {
                employee.setBadge("Ruby");
                employeeRepo.save(employee);

            } else if (totalPoints >= 2250 && totalPoints < 2500) {
                employee.setBadge("Sapphire");
                employeeRepo.save(employee);

            } else if (totalPoints >= 2500 && totalPoints < 2750) {
                employee.setBadge("Emerald");
                employeeRepo.save(employee);

            } else if (totalPoints >= 2750 && totalPoints < 3000) {
                employee.setBadge("Diamond");
                employeeRepo.save(employee);

            } else if (totalPoints >= 3000) {
                employee.setBadge("Platinum");
                employeeRepo.save(employee);

            } else {
                System.out.println("manager not having points that you enetered");
            }


            return employee;
        }


        return employee;
    }
}