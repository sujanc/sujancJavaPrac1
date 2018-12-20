package com.example.p1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoopTest {
    @Test
    public void loopTest1() throws Exception {
        //Arranga
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(2);
        values.add(3);
        values.add(3);
        values.add(3);
        List expectedValue= values;
        Loop p =new Loop();
        //Act
        List actualValue=p.loo(3);
        //Assert
        assertEquals(expectedValue, actualValue);
    }



    @Test
    public void loopTest2() throws Exception {
        //Arranga
        List<Integer> values = new ArrayList<Integer>();
        values.add(1);
        values.add(2);
        values.add(2);
        values.add(3);
        values.add(3);
        values.add(3);
        values.add(4);
        values.add(4);
        values.add(4);
        values.add(4);
        List expectedValue= values;
        Loop p =new Loop();
        //Act
        List actualValue=p.loo(4);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}