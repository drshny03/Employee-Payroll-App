package com.bridgelab.employeepayrollapp.repository;

import com.bridgelab.employeepayrollapp.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

//repository for employee
@Component
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    @Query(value = "select * from employees, employee_department where employee_id = id and department = :department", nativeQuery = true)
    List<EmployeeEntity> findEmployeeByDepartment(String department);
}