package com.example.p1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void testPalindrome1() throws Exception {
        //Arranga
        String expectedValue="Its a palindrome and sum of even no is less than 25";
        Palindrome p=new Palindrome();
        //Act
        String actualValue=p.palin(123454321);
        //Assert
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void testPalindrome2() throws Exception {
        //Arranga
        String expectedValue="Its not a palindrome";
        Palindrome p=new Palindrome();
        //Act
        String actualValue=p.palin(12345432);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}
