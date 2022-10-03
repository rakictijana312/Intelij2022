package JavaTeorija;

public class Super_This_Super_This {
/*

● this keyword is used to refer to the current object and differentiate between local
    and instance variables
    public class ThisKeyword {
12
        String name;
        int age;
        ThisKeyword(String name, int age){
            this.name=name;
            this.age=age;
        }
    }
● this() is used to access one constructor from another where both constructors
    belong to the same class.
    public class ThisKeyword4 {
        int z;
        ThisKeyword4() {
            System.out.println("This a default constructor");
        }
        ThisKeyword4(String a) {
            this();
            System.out.println("Parameterized constructor);
        }
    }
super vs super()
    Both are used in a subclass as a way to invoke or refer to its superclass.

     ● super keyword is used to call super class(parent class/ base class)

    variables and methods by the subclass object when they are overridden by




    subclasses.
● super() is used to call super class constructor from subclass constructor.





    public class SuperKeyword1 extends SuperKeyword{
13
        SuperKeyword1(){
            super(4);
            System.out.println("This is a child default constructor");
        }
        We can use super() and this() only in the constructor, not anywhere else, any attempt to
do so will lead to a compile-time error. This() and super() always have to be in the first
        line within the constructor and for that reason we CANNOT use them within the same
        constructor. We have to keep either super() or this() as the first line of the constructor but
        NOT both simultaneously
   */
}
