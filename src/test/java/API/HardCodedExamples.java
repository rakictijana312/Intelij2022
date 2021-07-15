package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class HardCodedExamples {

	/*
	 * NOTE:
	 * 
	 * Given - Preparing the request
	 * 
	 * When - making the request/making the call/hitting the endpoint
	 * 
	 * Then - verification/assertions
	 */

	String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MjYzOTE5NjcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYyNjQzNTE2NywidXNlcklkIjoiMjk2MSJ9.u2W0fDhjhJZij5IXQZ9MoDli2_knXZF5vy5nZv8k2xA";

	// @Test
	public void sampleTest() {

		RequestSpecification preparedRequest = given().header("Authorization", token)
				.header("Content-Type", "application/json").queryParam("employee_id", "20333320");

		Response response = preparedRequest.when().get("/getOneEmployee.php");
		System.out.println(response.asString());
	}

	@Test
	public void postCreateEmployee() {

		RequestSpecification preparedRequest = given().header("Authorization", token).header("Content-Type", "application/json")
						.body("{\n"
								+ "  \"emp_firstname\": \"Syntax\",\n"
								+ "  \"emp_lastname\": \"API\",\n"
								+ "  \"emp_middle_name\": \"Instructor\",\n"
								+ "  \"emp_gender\": \"F\",\n"
								+ "  \"emp_birthday\": \"1990-07-10\",\n"
								+ "  \"emp_status\": \"Employee\",\n"
								+ "  \"emp_job_title\": \"Healer\"\n"
								+ "}").log().all();
		
		Response response = preparedRequest.when().post("/createEmployee.php");
		
		response.prettyPrint();
		
		
		
	}

}
