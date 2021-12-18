package com.course1;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //variable declaration
        Scanner obj= new Scanner(System.in);
        double a,b,var, result1, result2,result3,result4;
        System.out.print("Enter 'a' Value:");
        a=obj.nextDouble();
        System.out.print("Enter 'b' Value:");
        b=obj.nextDouble();
        System.out.println("-----------------------------------------Arithmetic Operators---------------------------------------------------");
        // Output of Arithmetic Operators
        System.out.println("Addition a + b = "+ (a+b));
        System.out.println("Subtraction a - b = "+ (a-b));
        System.out.println("Multiplication a * b = "+ (a*b));
        System.out.println("Division a / b = "+ (a/b));
        System.out.println("Modulo a % b = "+ (a%b));
        System.out.println("------------------------------------ Assignment Operators--------------------------------------------------------");
        // Output of Assignment Operators
        var = a;
        System.out.println("variable using = operator: "+ var); // assign value =
        var+=a;
        System.out.println("variable using += operator: "+ var); // assign value +=
        var*=a;
        System.out.println("variable using *= operator: "+ var); // assign value *=
        var/=a;
        System.out.println("variable using /= operator: "+ var); // assign value /=
        obj.close();
        System.out.println("-------------------------------------increment and decrement operators4--------------------------------------------------------");
        // increment and decrement operators
        System.out.println("value of a: "+ a);
        System.out.println("value of b: "+ b);
        b=a++;
        System.out.println("After postIncrement of b=a++; a value: "+a +" b value:"+b);
        b = ++a;
        System.out.println("After PreIncrement of b=++a; a value: "+a +" b value:"+b);
        b=--a;
        System.out.println("After pre decrement of b=--a; a value: "+a +" b value:"+b);
        b=a--;
        System.out.println("After post decrement of b=a--; a value: "+a +" b value:"+b);

    }

}