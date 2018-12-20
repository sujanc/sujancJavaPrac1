package com.example.p1;

import java.util.Scanner;

public class Guess {


    String guess(int num){
        Scanner scan = new Scanner(System.in);
        int act = 77;
        String str="";

        while (num != act) {

            if (num < act) {

                System.out.println("No guessed is less than the original number");
            }
            if (num > act) {
                System.out.println("No guessed is greater than the original number");

            }

            System.out.println("Enter the no btw 1 to 100");
            num = scan.nextInt();
        }

        str = "No guessed is equal to the original number";

        return  str;
    }



    static public void main(String ars[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no btw 1 to 100");
        int num = scan.nextInt();
        Guess g =new Guess();
        String str = g.guess(num);
        System.out.println(str);
    }
}