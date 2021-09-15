package com.company.WhileLoop;
import java.util.*;
public class Palindrome {

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num=sc.nextInt();
            int rev=0,rem;
            int temp = num;
            while(num != 0)
            {
                rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            if(rev == temp)
                System.out.println("Number is Palindrome:"+rev);
            else
                System.out.println("Number is not Palindrome: "+rev);
    }
}
