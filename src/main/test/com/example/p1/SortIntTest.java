package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortIntTest {
    @Test
    public void sortTest1() throws Exception {
        //Arranga
        boolean expectedValue=true;
        SortInt s = new SortInt();

        //Act
        boolean actualValue=s.rev(5467865);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void sortTest2() throws Exception {
        //Arranga
        boolean expectedValue=false;
        SortInt s = new SortInt();

        //Act
        boolean actualValue=s.rev(1111);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}