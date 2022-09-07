package JavaEclipsVezbe;

public class StringPolidromeOrNot {

	public static void main(String[] args) {
		
		String original="hellhe";
		String reverse="";
		for (int i =original.length()-1; i>=0; i--) {
		reverse=reverse+original.charAt(i);
		}
		if (original.equals(reverse)) {
		System.out.println("Given String is Palindrome");
		}else {
		System.out.println("Given String is NOT Palindrome");
		}
		
		
		
		

}
}