package com.bridgelab.employeepayrollapp.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
    //attribute
    private int id;
    private String name;
    private double salary;
}