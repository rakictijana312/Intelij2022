package JavaTeorija;

public class StingBuilderBufferf {

    /*
The most important difference between String and StringBuffer in java is that String
object is immutable whereas StringBuffer object is mutable.
Once a String Object is
created we cannot change it and everytime we change the value of a String there is
actually a new String Object getting created. For example we cannot reverse string
directly, only through using StringBuffer class.
There are 2 ways to make String mutable: 1. by using StringBuffer 2. by using
StringBuilder.
The StringBuffer and StringBuilder Class are mutable means we can change the value of
it without creating a new Object. Objects of StringBuilder and StringBuffer Classes live
inside heap memory.

StringBuffer vs StringBuilder?
Both Classes are mutable, except StringBuffer is thread-safe (synchronized) and
StringBuilder is not thread-safe (non synchronized) which makes StringBuilder
faster compared to StringBuffer.


Garbage collector

Garbage collection is the process of looking at heap memory and identifying which
objects are in use and which are not and deleting unused objects. Once an object is
created it uses some memory and the memory remains allocated until there are
references for the use of the object.When there are no references to an object, it is
assumed to be no longer needed. There is no explicit need to destroy an object as Java
handles the deallocation automatically by using the Garbage Collection process.
Garbage collection in Java happens automatically during the lifetime of the program.








     */
}
