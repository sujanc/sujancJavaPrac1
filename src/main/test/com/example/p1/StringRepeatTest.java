package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {

    @Test
    public void StringRepeatTest1() throws Exception {
        //Arrange
        String expectedValue="applelele";
        StringRepeat s = new StringRepeat();
        //Act
        String actualValue=s.append("apple",2);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void StringRepeatTest2() throws Exception {
        //Arrange
        String expectedValue="mangongongongo";
        StringRepeat s = new StringRepeat();
        //Act
        String actualValue=s.append("mango",3);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

}