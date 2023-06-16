package JavaEclipsVezbe.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var="This is a demo of contain #+=-!%$#";
		System.out.println(var.contains("#"));
		if(var.contains("%")||var.contains("#")) {
			System.out.println("%,# are not allowed");
		}
		
		System.out.println(var.contains("This is a demo of"));
		
		System.out.println(var.startsWith("contain"));
		System.out.println(var.endsWith("#"));
		
	}

}
