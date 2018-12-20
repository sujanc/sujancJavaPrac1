package com.example.p1;

import java.util.Scanner;

public class StringRev {

    String reverse(String  str){
        String rev ="";
        for(int i=str.length() -1;i>=0;i--)
        {
            rev =rev + str.charAt(i);
        }

        return rev;
    }

    static public void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string");
        String str =scan.nextLine();
        StringRev s = new StringRev();
        String rev = s.reverse(str);
        System.out.println(rev);

    }
}
