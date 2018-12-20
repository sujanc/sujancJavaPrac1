package com.example.p1;

import java.util.Scanner;

public class UnspecifiedNo {

    int sum(String str){
        int sum =0;
        String array1[]= str.split(" ");
        for (String temp: array1){
            sum+= Integer.valueOf(temp);
        }
        return sum;
    }


    public static void main(String args[])
    {
        int sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers using spaces");
        String str = scan.nextLine();
        UnspecifiedNo u = new UnspecifiedNo();
        System.out.println(u.sum(str));
    }
}
