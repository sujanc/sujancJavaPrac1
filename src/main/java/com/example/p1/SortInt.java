package com.example.p1;

import java.util.*;

public class SortInt {

    static List<Integer> values = new ArrayList<Integer>();

    static int sum=0;
    static int k=0;
    boolean rev(int num ){

        int n;
        while(num > 0)
        {

            n = num % 10;
            if(n %2 ==0)
                sum+=n;
            values.add(n);
            num = num / 10;

        }

        Collections.sort(values, Collections.reverseOrder());
        System.out.println("The sorted no is");
        System.out.print(values);
        System.out.println("Sum of even no is " + sum);
        if(sum>15)
            return true;
        else
            return false;

    }


    static public void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no");
        int num =scan.nextInt();
        SortInt s = new SortInt();
        boolean b= s.rev(num);
        System.out.println(b);



    }
}
