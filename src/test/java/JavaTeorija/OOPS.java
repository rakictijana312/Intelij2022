package JavaTeorija;

public class OOPS {

    /*

    OOPS CONCEPTS are the main idea behind JAVA OBJECT ORIENTED PROGRAMING. It maintains our process easier
    and helps to avoid hard codding.

    There is 4 main OOPS CONCEPTS:

    1) Abstraction is a process of hiding the implementation of internal details and showing the
     functionality to the users. Abstraction lets you focus on what the object does instead of
     how it does it.
     Example: ATM machine: we do not know internal details of ATM but we can preform operations.

    2) Encapsulation (CAPSULA MEDICINE) mechanism -  in encapsulations, the variables of the class will be hidden from other
    classes and they can be access only though special methods. Encapsulation is also known as data hiding.
    To achieve encapsulation we need 2 steps:
         1) Declare variables od class as private
         2) Provide public getter method which helps us to view the variables values and public setter method which help
         us to modify tha variables value.
    We are using for security reasons, for more control and we can reduce a lot of bugs by using them.

    3) Inheritance is the process of acquiring properties (variables) & methods (behaviors) from one class to another.
    We are achieving by using extends keyword.
    Extends keyword is providing relationship two classes.
    The main purpose of using is code extensibility/ reducibility.
    There is 5 types:
         1) Single - single base/single delivered class
         2) Hierarchical - when class has more than one child
         3) Multilevel  -  base class, delivered adn multiple intermediate base class
         4) Multiple (interface) - multiple classes and single delivered class
         5) Hybrid (interface) - combination of single and multiple


     4) Polymorphism is the ability of an object to take on many forms. Polymorphism allows us to perform a task in
        multiple ways.
        Example: I am a father,son, husband in the same time
        Framework: Driver can run different browsers: Chrome, Explorer etc.

       Combination of overloading and overriding is known as Polymorphism.
       There are two types of Polymorphism in Java
          1. Compile time polymorphism (Static binding) – Method overloading
          2. Runtime polymorphism (Dynamic binding) – Method overriding

       METHOD OVERLOADING: Two methods in the same class have exact same name and diff parameters.
       Framework: Webdriver driver = New Chrome driver
                  Login method() - we can log in with username and password amd we can log in with phone num and password


       METHOD OVERRIDING: Declaring a method in child class which is already present in the parent class is called
       Method Overriding.In simple words, overriding means to override the functionality of an
       existing method.
       Framework: Oksana / toString() method

       We cant override STATIC method because is STATIC, so we cant override MAIN as well.

       We can overload the MAIN method  but program does not execute the overloaded MAIN method when you run your program.
       You have to call the overloaded main method from the actual main method.
       Practically I do not see any use of it and we did not use it in my framework.

       We cant override PRIVATE methods because they can't be inherited 

     */
}
