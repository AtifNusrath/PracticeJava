package com.company.ForLoop;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            int rev=0,rem;

            for( ;num != 0; num = num/10)
            {
                rem = num % 10;
                rev = rev * 10 + rem;

            }
            System.out.println("Reverse number : "+rev);
        }
}
