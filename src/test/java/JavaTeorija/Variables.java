package JavaTeorija;

public class Variables {
    public static void main(String[] args) {
        //primitive data types (8 of them)
        //Wrapper class - class whose object contain primitive data types
        int myInt=88;
        short myShort=847;
        long myLong=95566;
        double myDouble=12.25;
        float myFloat=324.3f;
        char myChar='y';
        boolean myBoolean=false;
        byte myByte=127;


        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);

        /*non primitives (Class, Object, Array, String, and Interface )

         - Class is the blueprint which we are using to create an object and is declared with class keyword

         - Object is instance of the class and has behaviour/method (eat, bark) and state/variable(color, bread)

         - String is the sequence of characters, for example String "Hello" has 5 ch. String is an object that has own
           methods (contains, length, substring, charAt). String is immutable object that means once is created can't
           be change

         - Interface is a blueprint for your class that can be used to implement a class. Interface is a collection
           of public static methods and public static variables.Its used for functional
           programing and to achieve abstraction in Java. We can't create object of ABSTRACT class and INTERFACE.

         - Variables are container that holds the value. To create variables we need
          1) data type ,
          2)name



           -Local variables
            Declare inside of the method, constructor or any block of code. They are created when the method is called
            and destroyed when the method exits.

           -Instance variables
            Declared inside of the class but outside of method, constructor or any block of code, we can access them
            by creating the object of the class they belong to. They are created when the object is created by using
            new keyword and destroyed when the object is destroyed.



            @FindBy(xpath="//img[contains(@src,'logo')]")
              public WebElement logo;



          -Static variables( everywhere in Common methods, such as wait, switch beetween frames, clicling on buttons,
          selecting the values from drop down)
          Declared inside of the class but outside of method,
          constructor or any block of code by using Static keyword. We can access variables without creating an
          object . They are created when program starts and destroyed when program stops.

         /* public static void click(WebElement element) {
         * waitForClickability(element);
         * element.click();

          Static keyword -
         1) variables and methods belong to the class and share between instances
         2) We can access to variables and methods without creating an object
         3) Static methods can not call non static members







         */




    }

}
