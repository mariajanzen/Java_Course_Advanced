package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Nick", 1999);
        Person person2=new Person("Jack", 2001);
        Person person3=new Person("Ivan", 1985);
        Person person4=new Person("Oleg", 1986);
        Person person5=new Person("Grisha", 1990, 82);

        Car car1=new Car("Audi", "red", 30000.00);
        Car car2=new Car("Audi", "black", 40000.00);
        Car car3=new Car("Opel", "white", 20000.00);

        person2.car=car1;
        person4.car=car3;
        person1.car=car2;

        System.out.println("------print persons-------");
        Person[] people = new Person[]{person1, person2, person3, person4, person5};
        for (int i=0; i<people.length; ++i){
            people[i].print();
        }
        System.out.println("------print cars-------");
        Car[] cars={car1, car2, car3};
        for(int i=0; i<cars.length; ++i){
            System.out.println(cars[i].toString());
        }
    }

}
