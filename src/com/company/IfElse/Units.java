package com.company.IfElse;
import java.util.*;
public class Units {

        public static void main(String args[])
        {
            System.out.println("Enter a number[1,10,100,1000....]");
            Scanner sc = new Scanner(System.in);
            int num=sc.nextInt();

            if(num == 1)
                System.out.println("Unit place");
            else if(num == 10)
                System.out.println("Ten's place");
            else if(num == 100)
                System.out.println("Hundred's Place");
            else if(num == 1000)
                System.out.println("Thousand's Place");

            else
                System.out.println("Bad Input");
        }
}
