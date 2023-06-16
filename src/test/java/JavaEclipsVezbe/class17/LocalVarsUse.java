package JavaEclipsVezbe.class17;

public class LocalVarsUse {
	double salary=120000;
	
	void printInfo() {
		String name="Asgahr";
		System.out.println(name+" "+salary);
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
	}

	void printSalaryPlusBonus() {
		double bonus=50000;
		System.out.println(salary+bonus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalVarsUse obj=new LocalVarsUse();
		obj.printInfo();
		obj.printSalaryPlusBonus();
	}

}
