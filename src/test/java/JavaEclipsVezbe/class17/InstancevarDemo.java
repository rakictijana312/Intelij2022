package JavaEclipsVezbe.class17;

public class InstancevarDemo {

	 String name="Aaziz";
	int age=10;
	void printInfo() {
		//if i am inside the same class and my method is not static 
		//i can use my instance variables directly 
		double salary=120000;
	    System.out.println(salary);
		System.out.println(name+" "+age);
	}
}
