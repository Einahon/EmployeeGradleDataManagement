package com.inahon.EmployeeGradleDataManagement.controller;

import com.inahon.EmployeeGradleDataManagement.model.Employee;
import com.inahon.EmployeeGradleDataManagement.service.Impl.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    @PostMapping("/employees")

    public String saveEmployee(@Valid @RequestBody Employee employee) {
        LOGGER.info("Logger for saveEmployee of EmployeeController");
        return "My controller works";
       // return employeeService.saveEmployee(employee);
    }

}
