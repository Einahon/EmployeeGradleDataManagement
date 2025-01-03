package com.inahon.EmployeeGradleDataManagement.repository;

import com.inahon.EmployeeGradleDataManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
