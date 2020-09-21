package com.company;

public class Main {

    public static void main(String[] args) {

    	Employee employer=new Employee("Qwe", 1000);
    	Programmer prog=new Programmer("Qwe", 1000);
    	//Object >> Employee >> Programmer
		String[] bonusList={"Jack", "Anna", "Nick"};

    	Employee[] employees=DBMock.getEmployees();
		for (Employee employee:employees){
		if (isBonus(bonusList, employee.getName())){
			employee.pay(550);
		}else{
			employee.pay();
		}

		}


		System.out.println("--------------");

		for (Employee employee:employees){
			System.out.println(employee.toString());
		}
		for (Employee employee:employees){
			employee.work();
		}


    }

    public static boolean isBonus(String[] bonusList, String name){
    	for (String str:bonusList){
    		if(str.equals(name)){
    			return true;
			}
		}
    	return false;
	}

	public static void payForEmployee(Employee employee){
    	employee.pay();
	}
}
