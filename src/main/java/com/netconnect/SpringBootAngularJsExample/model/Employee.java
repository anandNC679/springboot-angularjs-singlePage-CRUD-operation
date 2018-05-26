package com.netconnect.SpringBootAngularJsExample.model;

import lombok.Data;

/**
 * author anand.
 * since on 27/5/18.
 */
@Data
public class Employee {

    private Long empId;
    private String empNo;
    private String empName;
    private String position;

    Employee(){
    }

    public Employee(EmployeeForm employeeForm){
        this.empId = employeeForm.getEmpId();
        this.empNo = employeeForm.getEmpNo();
        this.empName = employeeForm.getEmpName();
        this.position = employeeForm.getPosition();
    }

    public Employee(Long empId, String empNo, String empName, String position) {
        this.empId = empId;
        this.empNo = empNo;
        this.empName = empName;
        this.position = position;
    }


}
