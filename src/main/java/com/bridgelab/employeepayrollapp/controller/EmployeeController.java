
package com.bridgelab.employeepayrollapp.controller;


import com.bridgelab.employeepayrollapp.model.EmployeeEntity;
import com.bridgelab.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controller for employee payroll service
@RestController
@RequestMapping("/employeeservice")
public class EmployeeController {

    EmployeeService employeeService;

    //constructor
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    //get methods
    @GetMapping("/get/{id}")
    public EmployeeEntity getEmployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/")
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    //post method
    @PostMapping("/post")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employee){
        return employeeService.addEmployee(employee);
    }

    //put method
    @PutMapping("/put/{id}")
    public EmployeeEntity updateEmployee(@PathVariable int id, @RequestBody EmployeeEntity employee){
        return employeeService.udpdateEmployee(id, employee);
    }

    //delete method
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return "employee deleted successfully";
    }
}
