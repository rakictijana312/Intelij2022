package JavaEclipsVezbe.class17;

public class Students {



	String studentName;
	String studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		Students JahanzebObj=new Students();
		JahanzebObj.studentName="Jahanzeb";
		JahanzebObj.studentID="12345";
		JahanzebObj.numberOfStudents++;
		System.out.println(JahanzebObj.studentID+" name "+JahanzebObj.studentName+" Number of Students "+Students.numberOfStudents);
		
		

        Students ramObj=new Students();
        ramObj.studentName="Ram";
        ramObj.studentID="45678";
        ramObj.numberOfStudents++;
        System.out.println(ramObj.studentID+" name "+ramObj.studentName+" Number of Students "+Students.numberOfStudents);
        System.out.println(Students.numberOfStudents);
        

	}
	
	
}
