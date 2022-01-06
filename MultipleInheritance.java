package com.course1;

interface  First{
    String firstName="Madhuri"; // static variable
}
interface Last{
    String lastName=" Ganta";
}
interface Display extends First,Last{
    void display();// public and abstract method
}
class Inheritance implements Display {

    @Override
    public void display() {
        System.out.println("Fullname: "+ (firstName + lastName));
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        obj.display();

    }
}
