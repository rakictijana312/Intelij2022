package JavaEclipsVezbe;

import java.util.Arrays;



public class PrintArray {

	public static void main(String[] args) {
	// Array of object references:
	String[] strArray = {"John", "Mary", "Bob"};
	System.out.println(Arrays.toString(strArray));

		
	//Array of primitives
	int[] array= {1, 2, 3, 4, 5};
    for (int element:array) {
	System.out.println( element);
	
	
    //Multi dimensional array
    int[][] arrayy = {{1, 2}, {3, 4}, {5, 6, 7}};
    System.out.println(Arrays.deepToString(arrayy));
			
			
    //Nisam sigurna multi dimenzional za strings????
    String [] [] arrray= {{"tijana", "Mihailo"}, {"radica", "darko"}};
    System.out.println(Arrays.deepToString(arrray));
		
    
    
    
    }}}