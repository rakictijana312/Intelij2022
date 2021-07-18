package APISteps;

import static io.restassured.RestAssured.given;


import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.apiConstants;

public class GenerateTokenSteps {

    static String token;
    @Given("a JWT is generated")

    public void a_JWT_is_generated() {

        RequestSpecification generateTokenRequest = given().header("Content-type", "application/json")
                .body("{\n"
                		+ "  \"email\": \"syntaxAPI@email.com\",\n"
                		+ "  \"password\": \"abcde\"\n"
                		+ "}");
        Response generateTokenResponse = generateTokenRequest.when().post(apiConstants.GENERATE_TOKEN_URI);
        generateTokenResponse.prettyPrint();

        token = "Bearer " + generateTokenResponse.jsonPath().getString("token");

    }
	
}
