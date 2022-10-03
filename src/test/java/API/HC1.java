package API;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//import org.junit.FixMethodOrder;   //add to sort result alfabeticly
//import org.junit.runners.MethodSorters;//add to sort result alfabeticly

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)//add to sort result alfabeticly


//NOTE:

// Given-PREPARING REQUEST

// When- making the request/making the call/hitting the end point

// Then-verification/assertions


public class HC1 {

    String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NjQxMzAyMzksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY2NDE3MzQzOSwidXNlcklkIjoiNDMyMSJ9.qEbofyTDn32gpmS6b3yphft8gQ3vooUJ_dZgPhkZMNk";
    String employee_id;

    @Test
    public void getEmployee() {

        String baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";

        //GIVEN -prepare req
        RequestSpecification preparedRequest = given().header("Authorization", token).
                header("Content-Type", "application/json ").queryParam("employee_id", "7077888");

        //WHEN - call the request
        Response response = preparedRequest.when().get("/getOneEmployee.php");

        //Print EMPLOYEE
        //  System.out.println(response.asString());


    }

    @Test
    public void createEmployee() {
        RequestSpecification preparedRequest = given().header("Authorization", token).header("Content-Type", "application/json").body("{\n" +
                "  \"emp_firstname\": \"tijanrA\",\n" +
                "  \"emp_lastname\": \"rakic\",\n" +
                "  \"emp_middle_name\": \"masa\",\n" +
                "  \"emp_gender\": \"F\",\n" +
                "  \"emp_birthday\": \"2022-09-09\",\n" +
                "  \"emp_status\": \"ENG\",\n" +
                "  \"emp_job_title\": \"Healer\"\n" +
                "\n" +
                "}"); //ovo je iskopirano iz postmana create employee

        Response response = preparedRequest.when().post("/createEmployee.php");

        //  response.prettyPrint();


        //Json allows us to return specific data from json object

        employee_id = response.jsonPath().getString("Employee.employee_id");

        //  System.out.println(employee_id);

        //preforme assertions
        response.then().assertThat().statusCode(201);

        //preforme assertions by using HamCrast matchers - we have to input manualy
        //import static org.hamcrest.Matchers.*;
        response.then().assertThat().body("Message", equalTo("Employee Created"));// we are comparing to value "Message": is equal "Employee Created"

        //Task: write assertion that verify that response body has the name you used:
        response.then().assertThat().body("Employee.emp_firstname", equalTo("tijanrA"));//ako nema error onda je PASS ako ima onda ne


        //Verifying server
        response.then().assertThat().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18"); //postman CreateEmployee / headers-down/ server (Apache/2.4.39 (Win64) PHP/7.2.18)


    }

    @Test
    public void getCreatedEmployee() {

        RequestSpecification preparedRequest = given().header("Authorization", token)
                .header("Content-Type", "application/json").queryParam("employee_id", employee_id);
        Response response = preparedRequest.when().get("/getOneEmployee.php");
        //  response.prettyPrint();

        String empId = response.jsonPath().getString("employee.employee_id");
        boolean comparingEmpIds = empId.contentEquals(employee_id);
        Assert.assertTrue(comparingEmpIds);

        //Task: Retrieve the first name and assert that the first name is the same as the one you used
        //Don't use HAMCREST MATCHERS

        String firstName = response.jsonPath().getString("employee.emp_firstname");
        Assert.assertTrue(firstName.contentEquals("stijanrA"));


    }

    @Test
    public void getAllEmployees() {
        RequestSpecification preparedRequest = given().header("Authorization", token).header("Content-Type", "application/json");
        Response response = preparedRequest.when().get("/getAllEmployees.php");

       String allEmployees = response.prettyPrint();

        JsonPath js = new JsonPath(allEmployees);
        int count = js.getInt("Employees.size()");
       // System.out.println(count);

        //Print out all employees IDs from the response

        for (int i = 0; i < count; i++) {
            String employeesIDs = js.getString("Employees[" + i + "].employee_id");
            // System.out.println(employeesIDs);

            /*
             * Verify stored employee ID from previous call is in response body
             */
            if (employeesIDs.contentEquals(employee_id)) {

                /*
                 * printing out the employee ID
                 */
                System.out.println("Employee ID " + employee_id + " is present in response body");


                String firstName = js.getString("Employees[" + i + "].emp_firstname");

                /*
                 * Printing out the first name of the employee that we created
                 */
                 System.out.println("Employee name is " + firstName);
                   break;
            }

        }


    }}


