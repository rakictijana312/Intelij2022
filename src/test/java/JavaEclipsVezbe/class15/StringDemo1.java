package JavaEclipsVezbe.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Azizi"; //Mostly used because of shorter syntax
		String name1=new String("Azizi"); //creating object of String class
		
		System.out.println(name);
		//Length=> number of characters in a String object
		System.out.println(name.length());
		name="     Azizi";
		int len=name.length();
		System.out.println(len);
		//
		
		
	}

}
