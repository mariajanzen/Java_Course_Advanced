package com.company;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    public int compareTo(Person person){
        return this.name.compareTo(person.name);
    }
    */

   /* public int compareTo(Person person) {
        if (this.age > person.age) {
            return 1;
        }
        if (this.age < person.age) {
            return -1;
        }
       return 0;
        }*/

   /* public int compareTo(Person person){
        if(this.name.equals(person.name)){
            return this.age-person.age;
        }
        return this.name.compareTo(person.name);
    }
*/
   public int compareTo(Person person){
       int nameComparing=this.name.compareTo(person.name);
       return (nameComparing==0)?
               this.age-person.age:nameComparing;
       }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
