package com.example.p1;

import java.util.Scanner;

public class TypeOfChar {



    String type(char ch){
        String str="";
        if (ch>=65 && ch<=90)
            str="Character is a capital letter";
        else if (ch>=97 && ch<=122)
            str="Character is a small letter";
        else if (ch>=48 && ch<=57)
            str ="Character is a digit";
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            str ="Character is a special symbol";

return str;
    }
    static  public void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch= scan.next().charAt(0);
        TypeOfChar t =new TypeOfChar();
        System.out.println(t.type(ch));

        }
    }

