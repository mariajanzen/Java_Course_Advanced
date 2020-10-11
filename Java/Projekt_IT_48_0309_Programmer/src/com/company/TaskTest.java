package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void compareTo(){
        Task t1 = new Task("1", 1, Status.READY, Priority.HIGH);
        Task t2 = new Task("2", 2, Status.READY, Priority.NORMAL);
        Task t3 = new Task("3", 3, Status.READY, Priority.LOW);
        Task t4 = new Task("4", 4, Status.READY, Priority.LOW);


        assertEquals(0, t3.compareTo(t4));
        assertTrue(t1.compareTo(t2)>0);
        assertTrue(t1.compareTo(t3)>0);
        assertTrue(t2.compareTo(t1)<0);
        assertTrue(t3.compareTo(t1)<0);
        assertTrue(t3.compareTo(t2)<0);
        assertTrue(t2.compareTo(t3)>0);

    }

}