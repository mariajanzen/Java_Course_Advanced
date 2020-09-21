package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskHandlerTest {
    @Test
    public void taskHandler_listProgrammer_listTaskForProgrammer(){
        Programmer p1=new Programmer("Name1",
                Arrays.asList(new Task("25", 25, Status.PENDING),
                        new Task("34", 34, Status.NOTACCEPTED),
                        new Task("17", 17, Status.READY)));

        Programmer p2=new Programmer("Name2",
                Arrays.asList(new Task("123", 123, Status.READY),
                        new Task("555", 555, Status.NOTACCEPTED),
                        new Task("456", 456, Status.READY)));

        Programmer p3=new Programmer("Name3",
                Arrays.asList(new Task("675", 675, Status.NOTACCEPTED),
                        new Task("45", 45, Status.NOTACCEPTED),
                        new Task("346", 346, Status.READY)));

        List<Programmer> programmers=new ArrayList <>();
        programmers.add(p1);
        programmers.add(p2);
        programmers.add(p3);

        TaskForProgrammer taskForProgrammer1= new TaskForProgrammer
                (new Task("34", 34, Status.NOTACCEPTED),p1);
        TaskForProgrammer taskForProgrammer2= new TaskForProgrammer
                (new Task("555", 555, Status.NOTACCEPTED),p2);
        TaskForProgrammer taskForProgrammer3= new TaskForProgrammer
                (new Task("675", 675, Status.NOTACCEPTED),p3);

        TaskForProgrammer taskForProgrammer4= new TaskForProgrammer
                (new Task("45", 45, Status.NOTACCEPTED),p3);

        List<TaskForProgrammer> expectedList=new ArrayList <>();

        expectedList.add(taskForProgrammer1);
        expectedList.add(taskForProgrammer2);
        expectedList.add(taskForProgrammer3);
        expectedList.add(taskForProgrammer4);

        assertEquals(expectedList, TaskHandler.taskHandler(programmers));

    }


}