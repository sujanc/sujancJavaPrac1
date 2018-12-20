package com.example.p1;

import java.util.Scanner;

public class StringRepeat {

    String append(String str,int num){
        int start = str.length()-num;

        String sub = str.substring(start,str.length());


        for(int j=0;j<num;j++)
        {
            str=str + sub;
        }
        return str;
    }


    static public void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scan.nextLine();
        System.out.println("Enter the no");
        int num = scan.nextInt();
        StringRepeat s = new StringRepeat();
        String st = s.append(str,num);
        System.out.println(st);


    }
}
