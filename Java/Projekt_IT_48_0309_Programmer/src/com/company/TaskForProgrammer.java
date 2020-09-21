package com.company;

import java.util.Objects;

public class TaskForProgrammer {
    private Task task;
    private Programmer programmer;

    public TaskForProgrammer(Task task, Programmer programmer) {
        this.task = task;
        this.programmer = programmer;
    }

    public Task getTask() {
        return task;
    }

    public Programmer getProgrammer() {
        return programmer;
    }

    @Override
    public String toString() {
        return "Task For Programmer:" +
                task +
                ", programmer=" + programmer.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskForProgrammer that = (TaskForProgrammer) o;
        return Objects.equals(task, that.task) &&
                Objects.equals(programmer, that.programmer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, programmer);
    }
}
