package com.inahon.EmployeeGradleDataManagement.service.Impl;

import com.inahon.EmployeeGradleDataManagement.model.Employee;
import com.inahon.EmployeeGradleDataManagement.repository.EmployeeRepository;
import com.inahon.EmployeeGradleDataManagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
