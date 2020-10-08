package com.company;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String description;
    private int id;
    private Status status;
    private Priority priority;

    public Task(String description, int id, Status status) {
        this(description, id, status, Priority.LOW);
        /*
        this.description = description;
        this.id = id;
        this.status = status;
        this.priority=Priority.LOW;
        */
    }

    public Task(String description, int id, Status status, Priority priority) {
        this.description = description;
        this.id = id;
        this.status = status;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task description: " + description +
                ", id=" + id +
                ", status= " + status+ ", priority= "+priority+'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                Objects.equals(description, task.description) &&
                status == task.status &&
                priority == task.priority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, id, status, priority);
    }

    public int getPrioritiesInNumbers(Priority priority){
        return priority.getPrioritiesInNumbers();
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task task) {

        return this.getPriority().compareTo(task.getPriority());
    }
}
