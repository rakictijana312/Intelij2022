package JavaTeorija;

public class Exceptions {
    /*

 An Exception is a problem that can occur during the normal flow of execution.
 Depending on the situation, we can use try and catch blocks.
 In try block: Code that might throw some exceptions
 In catch block: We define exception type to be caught and what to do if an exception
happens in TRY block code

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
35
Exception faced as part of java perspective:
● ArithmeticException - Arithmetic error, such as divide-by-zero.
● ArrayIndexOutOfBoundsException - Array index is out-of-bounds.
● NullPointerException - Invalid use of a null reference.
● IllegalArgumentException - Illegal argument used to invoke a method.


Example of exception handling from current framework:
public static Properties prop;
public static void readProperties(String filePath) {
try {
FileInputStream fis = new FileInputStream(filePath);
prop = new Properties();
prop.load(fis);
fis.close();
} catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
}

How many try and catch we can have, which bloc will get executed if get ArithmeticException exception?

There can be any number of catch blocks for a single try block and it is not necessary that
each try block must be followed by a catch block. It should be followed by either a catch
block or a finally block.
However only the catch block encountered first on the call stack that satisfies the
condition for the exception will be executed for that particular exception, rest will be
ignored.


try {
int a=10;
int b=0;
36
int c=a/b;
}catch (ArithmeticException e) {
System.out.println(e.getMessage());
}catch (Exception e) {
System.out.println(e.getMessage());
}











     */
}
