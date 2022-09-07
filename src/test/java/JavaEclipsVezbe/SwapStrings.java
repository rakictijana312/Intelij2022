package JavaEclipsVezbe;

public class SwapStrings {

	public static void main(String[] args) {
		
		//NIJE MI JASNO
		String x="Hello";
		String y="Welcome";
		
		x=x=y;//HelloWelcome
		y=x.substring(0,(x).length()-y.length());
		x=x.substring(y.length());
		
		System.out.println(x);
		System.out.println(y);
		

	}

}
