package JavaEclipsVezbe;

public class StringCharacterStringNumberofWords {

	public static void main(String[] args) {
	
	
		String str=" Hih9898jhjh%%^$%^ oio ";
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		System.out.println("Number of alpha character = "+number);
		
		
		
		String myString="Today is Wednesday and it is Java Class";
		String[] array=myString.split(" ");
		int words=array.length;
		System.out.println("Total words in string:"+myString+" = "+words);
		
	}

}
