package com.company.ForLoop;
import java.util.*;
public class NaturalNumbers {
        public static void main(String args[])
        {
            System.out.println("Enter number:");
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();

            int sum=0;

            for(int i=0;i<=n;i++)
            {
                sum+=i;

            }
            System.out.println("Sum of N natural number:"+sum);
        }
}
