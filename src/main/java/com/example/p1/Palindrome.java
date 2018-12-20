package com.example.p1;
import java.util.Scanner;

public class Palindrome {

public static int sum =0;

         int rev (int num ){

        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            if((num%10) %2 == 0)
                sum+= num % 10;
            num = num / 10;
        }
        return rev_num;

}


String palin(int num){

    String str="";
    int tmp = num;
    if(num  == rev(tmp))
    {
        if(sum > 25)

          str = "Its a palindrome and sum of even no is greater than 25";
        else
            str = "Its a palindrome and sum of even no is less than 25";
    }
    else
        str = "Its not a palindrome";

return str;
}


    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");

        int num = scan.nextInt();
       Palindrome p = new Palindrome();
        String str = p.palin(num);
        System.out.println(str);
    }
}


