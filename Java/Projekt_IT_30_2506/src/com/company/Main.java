package com.company;

public class Main {

    public static void main(String[] args) {
	Employee employee=new Employee("Jack", 100);
	employee.startTask("write the code");
	employee.finishTask();
	employee.paySalary();
		System.out.println("-----------------------");

	Programmer programmer=new Programmer("Nick", 100);
	programmer.startTask("coding");
	programmer.finishTask();
	programmer.paySalary();


    }
}
