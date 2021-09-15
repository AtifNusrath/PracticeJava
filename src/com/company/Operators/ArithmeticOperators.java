package com.company.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int sum  = a + b * c;
        int prod = a * b + c;
        int quot = c +a / b;
        int rem  = a % b + c;

        System.out.println(a + " + " + b + " * "+c+" = "+ sum);
        System.out.println(a + " * " + b +" + "+c+" = "+ prod);
        System.out.println(c+" + "+a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " + "+c+" = "+ rem);
        float max=sum,min=sum;

        if (prod > max)
            max=prod;
        else if (prod < min)
            min=prod;
        if (quot > max)
            max=quot;
        else if (quot < min)
            min=quot;
        if (rem>max)
            max=rem;
        else if (rem < min)
            min=rem;

        System.out.println("Largest number"+max);
        System.out.println("Smallest number"+min);

    }
}
