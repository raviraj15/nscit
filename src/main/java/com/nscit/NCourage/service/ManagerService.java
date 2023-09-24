package com.nscit.NCourage.service;

import com.nscit.NCourage.entity.Employee;
import com.nscit.NCourage.entity.Manager;

public interface ManagerService {

    Manager addManager(Manager manager);
    Employee addPointsToEmployee(int empId, int points,int manId);
}
