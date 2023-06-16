package JavaEclipsVezbe.class17;

public class Employee {
String empID;
double salary;
static String CEO="Sumair";

public static void main(String[] args) {
	
	Employee obj1=new Employee();
	obj1.empID="123";
	obj1.salary=150000;
	System.out.println( obj1.empID+" salary "+obj1.salary+" CEO "+obj1.CEO);
	
	Employee obj2=new Employee();
	obj2.empID="456";
	obj2.salary=180000;
	System.out.println( obj2.empID+" salary "+obj2.salary+" CEO "+obj2.CEO);
}
}
