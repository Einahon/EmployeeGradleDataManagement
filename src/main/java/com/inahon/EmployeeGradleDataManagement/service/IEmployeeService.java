package com.inahon.EmployeeGradleDataManagement.service;

import com.inahon.EmployeeGradleDataManagement.model.Employee;
import com.inahon.EmployeeGradleDataManagement.repository.EmployeeRepository;

public interface IEmployeeService {
   public Employee saveEmployee(Employee employee);
}
