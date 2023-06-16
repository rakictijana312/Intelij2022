package JavaEclipsVezbe.class15;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student ramObj=new Student(); //Creating an object
		ramObj.name="Ram";
		ramObj.age=25;
		ramObj.studentId="CS123";
		ramObj.schoolName="Syntax";
		ramObj.study();
		ramObj.payTuition();
		
		Student aimenObj=new Student();
		aimenObj.name="Aimen";
		aimenObj.age=26;
		aimenObj.studentId="CS456";
		aimenObj.schoolName="Syntax";
		aimenObj.study();
		aimenObj.payTuition();
				
		
	}

}
