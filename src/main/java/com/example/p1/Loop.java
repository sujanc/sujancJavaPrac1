package com.example.p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loop {


    List loo(int n){
        List<Integer> values = new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                values.add(i);
        }
        return values;
    }

    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("ENter the no");
        int n =scan.nextInt();
        Loop p =new Loop();

        List<Integer> values = new ArrayList<Integer>();
        values=p.loo(n);
        for(int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }

    }
}
