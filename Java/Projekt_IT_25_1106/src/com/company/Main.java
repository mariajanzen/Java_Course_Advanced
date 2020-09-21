package com.company;

public class Main {

    public static void main(String[] args) {
        DBMock db=new DBMock();
        Student[] students=db.getStudents();

        print(students);
        System.out.println("--------print the Best Student--------");
        System.out.println(getTheBestStudent(students));

        //students[0].reit=-10;

    }

    public static void print(Student[] students){
        for (int i=0; i<students.length; i++){
            System.out.println(students[i].toString()+"\t");
        }
    }

    public static Student getTheBestStudent(Student[] students){
        Student studentMaxRate=students[0];
        int maxIndex=0;
        for (int i=0; i<students.length; ++i){
            if(students[i].getRate()>studentMaxRate.getRate()){
                studentMaxRate=students[i];
            }
        }
        return studentMaxRate;
    }
}
