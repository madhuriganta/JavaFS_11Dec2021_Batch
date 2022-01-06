package com.course1;
interface If1 {
    int add(int a, int b);
    int sub(int a, int b);
}
interface If2 {
    int add(int a , int b);
    int mul(int a, int b);
}
class TestClass implements If1,If2{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        TestClass obj=new TestClass();

        System.out.println(obj.add(5,6));
        System.out.println(obj.sub(8,6));
        System.out.println(obj.mul(5,6));

    }
}
