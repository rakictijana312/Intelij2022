package utils;

public class apiPayloadConstants {
	
	public static String createEmployeePayload() {
		
		String createEmployeePayload = "{\n"
				+ "  \"emp_firstname\": \"Syntax\",\n"
				+ "  \"emp_lastname\": \"API\",\n"
				+ "  \"emp_middle_name\": \"Instructor\",\n"
				+ "  \"emp_gender\": \"F\",\n"
				+ "  \"emp_birthday\": \"1990-07-10\",\n"
				+ "  \"emp_status\": \"Employee\",\n"
				+ "  \"emp_job_title\": \"Healer\"\n"
				+ "}";
		
		return createEmployeePayload;
	}

}
