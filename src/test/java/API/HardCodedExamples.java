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

	@Test
	public void sampleTest() {

		String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";

		RequestSpecification preparedRequest = given().header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MjYzMDU0ODYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYyNjM0ODY4NiwidXNlcklkIjoiMjk2MSJ9.j8ws9_rIGldrI9Urzr_gzCM4rIKQ5hAWU8pbrGoLi0U")
				.header("Content-Type", "application/json").queryParam("employee_id", "20333320");

		Response response = preparedRequest.when().get("/getOneEmployee.php");

		System.out.println(response.asString());

	}

}
