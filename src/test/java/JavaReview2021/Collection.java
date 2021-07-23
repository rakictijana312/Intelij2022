package JavaReview2021;

public class Collection {
    /*

   COLLECTION is framework in Java  that provides an architecture how to store a group of object as a single unit.
   They include several components: Arraylist, LinkedList, Vector, HasSet.

   Array list in framework, when you write data that will not change.
   An array is a container object that holds a fixed number of values. The length of an array is established when the
   array is created. After creation, its length is fixed.

   ArrayList is a class which implements the List interface of collection framework.ArrayList is a dynamic data structure,
   we can add and remove the elements from ArrayList and size will be adjusted automatically.

   Difference between ARRAY and ARRAYLIST:
     ● Arrays are fixed in size but ArrayLists are dynamic in size.
     ● Array can contain both primitives and objects but ArrayList can contain only object elements.
     ● To find the size on an Array we use ArrayName.length and for arrayList we use ArrayListName.size()
     ● Array uses assignment operators to store elements but ArrayList uses add() to insert
     elements.
     ● Array can be multi dimensional , while ArrayList is always single dimensional.

    ARRAY LIST:
    - non synchronized
    - allows duplicates
    - maintain insertion
    - you can add any number or null values
    - completely index based

    LinkedList:
    ● LinkedList internally uses a doubly linked list to store the elements (consist of
    value + pointer to previous node and pointer to the next node)
    ● Manipulation with LinkedList is faster than ArrayList because it uses a doubly
    linked list, so no bit shifting is required in memory.
    ● LinkedList is better for manipulating data.

   //Create linked list
   LinkedList linkedList = new LinkedList();
   //Add elements
   linkedList.add("A");
   linkedList.add("B");
   System.out.println(linkedList);

   //Add elements at specified position
   linkedList.add(2, "C");
   linkedList.add(3, "D");
   System.out.println(linkedList);

   //Remove element
   linkedList.remove("A"); //removes A
   linkedList.remove(0); //removes B
   System.out.println(linkedList);

    ARRAY LIST VS LIKELIEST:
    - both implement list interface
    - both non synchronized
    - both allow duplicate elements

    HashSet
    - HashSet implements Set interface
    - does’t allow duplicates values
    - does’t maintain any order
    - allow one null value
    - completely object based

    Vector
    - implements list interface
    - Vector - is synchronized, so it is slow.


    In my project I mostly use List nad Maps.
    Maps are not the part of collection but they are build on collection concepts.
    Maps contains unique key and is useful to search, update or delete elements. Map is an interface that contain entry
    as key and value pair. Map is collection of entry object and we can implement dy dif Java  classes:
    HashMap, HashTable,LinkedHashMap and TreeMap.

    In my framework I use when I want to fetch data from Excel.

    1) HasMap:
       - No duplicate keys/multiple duplicate values
       - non sihnorized
       - store data as key/value paired object
       - allows one null key and multiple null values

    2) HashTable:
       - No duplicate key/value
       - sihnorized - TREAD SAFE
       - its slow

    3) LinkedHashMap: use to store the elements  and we are maintain insertion order of keys inserted into MAP

    4) Tree map: We are using them to store keys in accenting order, contain unique and cant have multiple null values.
    They are slower than hashMap and the are sihnorized.



































     */
















}
