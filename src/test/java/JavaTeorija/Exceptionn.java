package JavaTeorija;

public class Exceptionn {
    /* How can you handle exceptions? Types of exceptions you faced in your project?
What is the parent of all exceptions?
An Exception is a problem that can occur during the normal flow of execution.
Depending on the situation, we can use try and catch blocks.
In try block: Code that might throw some exceptions
In catch block: We define exception type to be caught and what to do if an exception
happens in TRY block code
Throwable class is parent of all Exceptions:
try {
int a=10;
int b=0;
int c=a/b;
}catch (ArithmeticException e) {
System.out.println(e.getMessage());
}

Types of Exception:
1. Checked Exception - are the exceptions that are checked at compile time.
Example of checked exceptions:
● ClassNotFoundException - Class not found
● InstantiationException - Attempt to create an object of an abstract class or
interface
● FileNotFoundException - Attempt to open file that doesn’t exist or open file to
write but have only read permission

2. Unchecked Exception - are the exceptions that are not checked at compile time, they are
Runtime Exceptions.



Exception faced as part of java perspective:
● ArithmeticException - Arithmetic error, such as divide-by-zero.
● ArrayIndexOutOfBoundsException - Array index is out-of-bounds.
● NullPointerException - Invalid use of a null reference.
● IllegalArgumentException - Illegal argument used to invoke a method.




    How many catch blocks can we have? Which catch block will get executed if you
get ArithmeticException?
There can be any number of catch blocks for a single try block and it is not necessary that
each try block must be followed by a catch block. It should be followed by either a catch
block or a finally block.
However only the catch block encountered first on the call stack that satisfies the
condition for the exception will be executed for that particular exception, rest will be
ignored.

try {
int a=10;
int b=0;


int c=a/b;
}catch (ArithmeticException e) {
System.out.println(e.getMessage());
}catch (Exception e) {
System.out.println(e.getMessage());
}

Throws - is used to declare an exception
Throw - is used in the method body to throw an exception
Final keyword - final class cant be inherited, final variable cant be change, final method cant be overridden
Finally - is the block of code, it will get execute even is exception is handle or not
Finalize - is the method which preform clean up operations on objects, removing them from heap memory






     */
}
