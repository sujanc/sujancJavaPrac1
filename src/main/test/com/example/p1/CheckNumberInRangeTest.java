package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberInRangeTest {
    @Test
    public void tomJerryTest1() throws Exception {
        //Arranga
        String expectedValue="Jerry";
        CheckNumberInRange t = new CheckNumberInRange();

        //Act
        String actualValue=t.Check(26);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void tomJerryTest2() throws Exception {
        //Arranga
        String expectedValue="Tom";
        CheckNumberInRange t = new CheckNumberInRange();

        //Act
        String actualValue=t.Check(25);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void tomJerryTest3() throws Exception {
        //Arranga
        String expectedValue="No not btw 20 and 30";
        CheckNumberInRange t = new CheckNumberInRange();

        //Act
        String actualValue=t.Check(65);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}