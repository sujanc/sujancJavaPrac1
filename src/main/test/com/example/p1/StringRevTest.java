package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRevTest {

    @Test
    public void stringReverseTest1() throws Exception {
        //Arranga
        String expectedValue="elppa";
        StringRev s = new StringRev();
        //Act
        String actualValue=s.reverse("apple");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void stringReverseTest2() throws Exception {
        //Arranga
        String expectedValue="ognam";
        StringRev s = new StringRev();
        //Act
        String actualValue=s.reverse("mango");
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}