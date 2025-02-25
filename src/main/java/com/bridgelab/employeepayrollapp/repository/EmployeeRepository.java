package com.bridgelab.employeepayrollapp.repository;

import com.bridgelab.employeepayrollapp.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

//repository for employee
@Component
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}