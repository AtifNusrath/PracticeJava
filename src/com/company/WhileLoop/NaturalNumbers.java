package com.company.WhileLoop;

import java.util.*;
public class NaturalNumbers {

    public static void main(String args[])
    {
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0,i=0;

        while(i<=n)
        {
            sum=sum+i;
            i++;
        }
        System.out.println("Sum of N natural number:"+sum);
    }

}

