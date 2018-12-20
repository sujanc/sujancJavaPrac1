package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnspecifiedNoTest {
    @Test
    public void SumTest1() throws Exception {
        //Arranga
        int expectedValue = 44;
        UnspecifiedNo u = new UnspecifiedNo();

        //Act
        int actualValue = u.sum("1 34 5 4");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void SumTest2() throws Exception {
        //Arranga
        int expectedValue = 205;
        UnspecifiedNo u = new UnspecifiedNo();

        //Act
        int actualValue = u.sum("1 45 67 89 3");
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}