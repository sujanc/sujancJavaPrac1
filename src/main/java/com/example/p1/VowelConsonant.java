package com.example.p1;

import java.util.Scanner;

public class VowelConsonant {

    String vowCons(String str) {
        String st = "";
        int len = str.length();
        boolean isVowel;
        for (int i = 0; i < len; i++) {

            isVowel = false;
            char c = str.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    isVowel = true;
            }
            if (isVowel == true) {
                st = st +c + "Vowel ";
            } else {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    st = st +c + "Consonant ";

                } else {
                    st = st +"Input is not an alphabet ";

                }
            }
        }
        return st;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word");
        String str = scan.nextLine();
        VowelConsonant v = new VowelConsonant();
        System.out.println(v.vowCons(str));

    }
}

