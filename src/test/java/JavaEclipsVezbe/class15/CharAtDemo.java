package JavaEclipsVezbe.class15;

public class CharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Roheen";
		System.out.println(name.charAt(3));
		int sum=0;
		for(int i=0; i<name.length();i++) {
		
			if(name.charAt(i)=='e') {
				sum++;
			}
		}
		System.out.println(sum+" es are found");
	}

}
