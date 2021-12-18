package com.course1;

public class PermutationsAndCombinations {
    public static void main(String[] args) {
        System.out.println("Factorial: "+ factorial(3));
        System.out.println("nCr: "+nCr(3,2));
        System.out.println("nPr: "+nPr(3,2));

    }
    public static int factorial(int n) {
        int fact=1;
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int nCr(int n, int r)
    {
        int result = factorial(n)/(factorial(r)*factorial(n-r));
        return result;
    }
    public static int nPr(int n, int r)
    {
        int result= factorial(n)/factorial(n-r);
        return result;
    }
}
