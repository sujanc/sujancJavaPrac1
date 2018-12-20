package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTest {
    @Test
    public void guessTest1() throws Exception {
        //Arranga
        String expectedValue="No guessed is equal to the original number";
        Guess g =new Guess();
        //Act
        String actualValue=g.guess(77);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}