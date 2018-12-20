package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TypeOfCharTest {
    @Test
    public void typeOfChar1() throws Exception {
        //Arranga
        String expectedValue = "Character is a special symbol";
        TypeOfChar t = new TypeOfChar();

        //Act
        String actualValue = t.type('%');
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void typeOfChar2() throws Exception {
        //Arranga
        String expectedValue = "Character is a capital letter";
        TypeOfChar t = new TypeOfChar();

        //Act
        String actualValue = t.type('A');
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void typeOfChar3() throws Exception {
        //Arranga
        String expectedValue = "Character is a small letter";
        TypeOfChar t = new TypeOfChar();

        //Act
        String actualValue = t.type('c');
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void typeOfChar4() throws Exception {
        //Arranga
        String expectedValue = "Character is a digit";
        TypeOfChar t = new TypeOfChar();

        //Act
        String actualValue = t.type('0');
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}

