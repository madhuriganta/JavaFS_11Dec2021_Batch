/* Q1. What is abstraction?

The meaning of abstraction is : is the process of working with ideas rather than their implementation.

Abstraction is a process of hiding the implementation details and showing only functionality to the user.
Another way , it shows only essential things to the user and hides the internal details.
For example sending SMS where we type the text and send the message. we don't know the internal processing about the message delivery.

Advantages of Abstraction:
1. Increase Security and complexity 
2. Reduces Complexity
3. Avoid Code Duplication 
4. Eases the burden of maintenance 

Abstraction defines an object in terms of its properties(attributes), behaviour(methods) and interfaces (means of communicating  with other objects.

How to Achieve Abstraction in Java?

In Java we can achieve Data Abstraction using Abstract Class and Interfaces .
Abstract Classes allow partial to complete abstraction because abstract classes contains concrete methods that have the implementation which results partial abstraction.
Interfaces
==================================================================================================================================================================================================================
Q2. Is Abstract class is related to Abstraction? find it?

Abstract class and Abstraction both are different concept.

Abstract class provides the flexibility to have certain concrete methods and some other methods that the derived classes should implement.
Abstract class have normal methods and abstract methods.
Main purpose of abstract class is two things 1. Reusability  2. Enforcement

Abstraction-it is one of the pillar of oops concept. Abstraction is a process of hiding the implementation details and showing only functionality to the user.
        another way, it shows  only essential things to user and hides the internal details.

========================================================================================================================================================================================================================
Q3.Interfaces also can have few things - what are those things can interfaces have apart from abstract methods?
An interface in java is a blueprint of a class.
-Interface is like a pure abstract class.
-by default methods in interface are public and abstract
-interface we cal it as contract

In JDk8:
1.interface could not define implementation. we can now add default implementation for interface methods.class .
This default implementation has special use and does not affect the intention behind interfaces.
   interface  Sample{
    default void display(){
        System.out.println("Hello");
    }
   }
   class TestClass implements Sample{
     public static void main(String[] args){
         TestClass obj=new TestClass();
         obj.display();

    }
   }
   o/p: hello
2.We can define static methods in interfaces which can be called independently without an object. These methods are not inherited.

interface  Sample{
    static void display(){
        System.out.println("Hello");
    }
}
class TestClass implements Sample{
    public static void main(String[] args){
          Sample.display();

    }
}
O/p:hell0
-In JDK9:
1.static methods
2.private methods
3.private static methods.

- All methods are public and abstract. And all the fields are public, static, and final
- it is used to achieve multiple inheritance
===================================================================================================================================================================================================================================

Q4.Can interfaces have normal variables ?
Interface has no state, all variables declared inside interface are implicitly public, static and final.
==================================================================================================================================================================================================================================

Q5. Can interfaces have methods with definitions ? if so how ? or what ?
 yes, interfaces have methods with definition, but the methods declared in an interface are by default or static
 Default methods are methods that can have a body. The most important use of default methods in interfaces is to provide additional functionality to a given type without breaking down the implementing classes.
 The static methods in interfaces are similar to default methods but the only difference is that you can’t override them.
        Now, why do we need static methods in interfaces if we already have default methods?
        Suppose you want to provide some implementation in your interface and you don’t want this implementation to be overridden in the implementing class, then you can declare the method as static.
===========================================================================================================================================================================================================================
Q6.
interface  First{
    String firstName="Madhuri";
}
interface Last{
    String lastName=" Ganta";
}
interface Display extends First,Last{
    void display();
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


*/