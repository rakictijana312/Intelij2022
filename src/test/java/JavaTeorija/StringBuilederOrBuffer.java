package JavaTeorija;

public class StringBuilederOrBuffer {

    /*

 The most important difference between String and StringBuffer in java is that String
object is immutable whereas StringBuffer object is mutable. Once a String Object is
created we cannot change it and everytime we change the value of a String there is
actually a new String Object getting created. For example we cannot reverse string
directly, only through using StringBuffer class.

There are 2 ways to make String mutable: 1. by using StringBuffer 2. by using
StringBuilder.
The StringBuffer and StringBuilder Class are mutable means we can change the value of
it without creating a new Object. Objects of StringBuilder and StringBuffer Classes live
inside heap memory.


immutability vs. mutability
✓ String is an immutability class. It means once we are creating String objects it is not
possible to perform modifications on existing objects. (String object is fixed object)
✓ StringBuffer and StringBuilder are mutability classes. It means once we are creating
StringBuffer/ StringBuilder objects on that existing object it is possible to perform
modification.

 StringBuffer vs StringBuilder?
Both Classes are mutable, except StringBuffer is thread-safe (synchronized) and
StringBuilder is not thread-safe (non synchronized) which makes StringBuilder
faster compared to StringBuffer.

















     */
}
