package JavaEclipsVezbe;

public class MutableStringObject {

	public static void main(String[] args) {
	
		String a="Hello";
		String b="Hello";
		
		
		StringBuffer sb= new StringBuffer("Hello Syntax");
		a=a.concat(" Syntax");
		System.out.println(a);
		
		
		sb= sb.append(" Texnologies");
		System.out.println(sb);
		
	}

}
