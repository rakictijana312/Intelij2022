package JavaEclipsVezbe.class17;

public class Ram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary=0.000012;
		String s=String.valueOf(salary);
		System.out.println(s);
		String converted="";
		for(int i=s.length()-1;i>=0;i--) {
			
			converted+=s.charAt(i);
		}
		
		System.out.println(converted);
	}
	


}
