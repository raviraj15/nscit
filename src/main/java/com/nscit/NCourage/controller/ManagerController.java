package com.nscit.NCourage.controller;

import com.nscit.NCourage.entity.Employee;
import com.nscit.NCourage.entity.Manager;
import com.nscit.NCourage.service.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerServiceImpl service;

    @PostMapping("/addManager")
    public ResponseEntity<Manager> addManager(@RequestBody Manager manager)
    {
        Manager manager1 = service.addManager(manager);
        return new ResponseEntity<>(manager1, HttpStatus.CREATED);
    }
    @PostMapping ("/addPointsToEmployee/{empId}/{points}/{manId}")
    public ResponseEntity<Employee> addPointsToEmployee(@PathVariable int empId,@PathVariable int points,
    @PathVariable int manId)
    {
        Employee employee = service.addPointsToEmployee(empId, points, manId);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }


}
