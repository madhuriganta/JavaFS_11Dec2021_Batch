package com.course1;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        //variable declaration
        Scanner obj=new Scanner(System.in);
        int n;
        // read data from user
        System.out.print("Enter number:");
        n=obj.nextInt();
        System.out.println("Multiplication table of "+n+":");
        for(int i=1;i<=10;i++)
            System.out.println(n+"x"+i+"="+n*i);//print output
        obj.close();
    }

}
