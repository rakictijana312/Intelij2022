package JavaEclipsVezbe.class17;

public class LocalVariablesDemo {

	/*
	 * Are the variables which are declared inside a method, constructor or any block of code like if conditions
while loop, for loop, do while loop, switch statement anything inside
a class that has a "{" and and ending "}"
	 */
	
	void printInfo(String name) {
		String phoneNumber="123456789";
		System.out.println(name);
	}
	
	void printInfoWithAddress(String name,String address) {
		System.out.println(name+address);
		//System.out.println(phoneNumber); CE not defined 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Local";
		
		System.out.println(name);
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		//System.out.println(i); CE not defined 
		
		{
			int x=10;
			{
			int y=20;
			System.out.println(x);
			}
			//System.out.println(y); CE not defined 
		}

	}

}
