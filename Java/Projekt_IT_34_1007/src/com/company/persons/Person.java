package com.company.persons;

public class Person {
    private String name;
    private int yearOfBirth;
    private int numberOfGuests;
    private Date arrDate;
    private Date outDate;

    public Person(String name, int yearOfBirth, int numberOfGuests, Date arrDate, Date outDate) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.numberOfGuests=numberOfGuests;
        this.arrDate=arrDate;
        this.outDate=outDate;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        int age=2020-yearOfBirth;
        return age;
    }
    public int getNumberOfGuests(){
        return numberOfGuests;
    }

    public String getArrDate() {

        return arrDate.toString();
    }

    public String getOutDate() {
        if (isDateCorrect(arrDate, outDate) == true) {
            return outDate.toString();
        }else {
            return arrDate.toString();
        }
    }

    private boolean isDateCorrect(Date arrDate, Date outDate){
        if(outDate.getDay()>arrDate.getDay()&&outDate.getMonth()>=arrDate.getMonth()&&outDate.getYear()>=arrDate.getYear()) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "The client => " +
                name + ", " + getAge() +" years old.";
    }

    public String dateToString() {
        return "The client => " +
                name + ", comes to the hotel on " + getArrDate()+" till "+getOutDate();
    }


}
