package com.course1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // variable declaration
        Scanner obj = new Scanner(System.in);
        int i,n,fact=1;
        // read data from user
        System.out.println("Enter number:");
        n=obj.nextInt();
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        //print output
        System.out.println("Factorial of " + n +" is: "+fact);
        obj.close();
    }
}
