package com.bridgelab.employeepayrollapp.dto;

import com.bridgelab.employeepayrollapp.model.EmployeeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

//Employee model
@Component
@Entity
@Table(name = "employees")
public class EmployeeDTO {
    //attribute
    private int id;
    private String name;
    private double salary;

    /// constructor
    public EmployeeDTO(){}
    public EmployeeDTO(EmployeeEntity employeeEntity){
        this.id = employeeEntity.getId();
        this.name = employeeEntity.getName();
        this.salary = employeeEntity.getSalary();
    }
    //getter and setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}