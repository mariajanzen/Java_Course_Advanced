package com.company;

public class DBMock {
    //read DB
    public Student[] getStudents(){
        Student student1=new Student("Oleg", "12E", new Rate("math", 68.9, new int[]{74, 81, 99, 25, 48}) );
        Student student2=new Student("Daria", "12M", new int[]{99, 54, 63, 43});
        Student student3=new Student("Maria", "12E", new int[]{34, 78, 45, 70, 81, 34});
        Student student4=new Student("Irina", "12M", new int[]{88, 76,88, 54});
        Student student5=new Student("Bogdan", "12E", new int[]{67, 12,45,68,90});

        Student[] students=new Student[]{student1, student2, student3, student4, student5};
        return students;
    }
}
