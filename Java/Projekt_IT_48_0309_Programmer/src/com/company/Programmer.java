package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Programmer {
    private String name;
    private List <Task> tasksList;

    public Programmer(String name, List <Task> tasksList) {
        this.name = name;
        this.tasksList = tasksList;
    }

    public String getName() {
        return name;
    }

    public List <Task> getTasksList() {
        return tasksList;
    }

    @Override
    public String toString() {
        return "Programmer: " + name + '\'' +
                ", list of tasks=  " + tasksList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(tasksList, that.tasksList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasksList);
    }

    public List<Task> getTaskList(Status status){
        List<Task> resList=new ArrayList <>();
        for(Task iTask:tasksList){
            if(iTask.getStatus().equals(Status.NOTACCEPTED)){
                resList.add(iTask);
            }
        }
        return resList;
    }

}
