package com.example.p1;
import java.util.Scanner;

public class CheckNumberInRange {


    String Check(int num) {
        String str;
        if (num % 2 == 0) {
            if (num > 20 && num < 30)
                str = "Jerry";
            else
                str = "No not btw 20 and 30";
        } else {
            if (num > 20 && num < 30)
                str = "Tom";
            else
                str = "No not btw 20 and 30";

        }
        return str;
    }


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = scan.nextInt();
        CheckNumberInRange t = new CheckNumberInRange();
        System.out.println(t.Check(num));

    }
}
