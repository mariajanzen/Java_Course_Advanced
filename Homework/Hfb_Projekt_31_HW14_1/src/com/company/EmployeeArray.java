package com.company;

import com.company.entity.Employee;
import com.company.entity.Programmer;

public class EmployeeArray {
    private Employee[] employees;

    public EmployeeArray(Employee[] employees) {
        this.employees = employees;
    }

    public void printAll(){
        for (Employee employee: employees){
            System.out.println(employee);
            System.out.println("---------");
        }
    }
    public void payAll(){
        for (Employee employee: employees){
                employee.pay();
        }
    }

    public void workAll() {
        for (Employee employee : employees) {
            System.out.print(employee.getName()+"   >>  ");;
            employee.work();
        }
    }

    public void codeReviewAll(){
        for (Employee employee: employees) {
            if (employee instanceof Programmer) {
                System.out.print(employee.getName()+"   >>  ");;
                employee.codeReview();
            }
        }
        }

}
