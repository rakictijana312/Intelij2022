package JavaEclipsVezbe;

public class reverseStrings {

	public static void main(String[] args) {

    //0. way by using StringBuffer class or StringBuilder- isto je
	String a="Hello World";
	StringBuilder sb=new StringBuilder(a);
	System.out.println(sb.reverse());

	
	 
/*	 
	 String toReverse="Hello World";
	 
	 //1. way using charAt();
	 String reversed="";
	 for(int i=toReverse.length()-1; i>=0; i--) {
		 reversed=reversed+toReverse.charAt(i);
		 
	 }
	 
	 System.out.println("Reverse String is: " +reversed) ;
	 
	
		
		
		
    //2. way using to charArray();
		String toReverse="Hello World";
		String reversed="";
		char[] array= toReverse.toCharArray();
		for(int i=array.length-1; i>=0; i--) {
			reversed=reversed+array[i];
		}
		System.out.println("Reversed string is: " +reversed);
		
		
		*/
	 
	}}