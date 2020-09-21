package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Task task1= new Task("1xxxx", 1, Status.READY, Priority.HIGH);
        Task task2= new Task("2xxxx", 2, Status.PENDING, Priority.LOW);
        Task task3= new Task("3xxxx", 3, Status.NOTACCEPTED, Priority.HIGH);
        Task task4= new Task("4xxxx", 4, Status.READY);
        Task task5= new Task("5xxxx", 5, Status.NOTACCEPTED, Priority.NORMAL);

        List<Task> tasks=new ArrayList <>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);


        System.out.println(TaskHandler.taskQueue(tasks));



    }

}
