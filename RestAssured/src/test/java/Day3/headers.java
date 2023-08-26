package Day3;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

public class headers {
	@Test
	void headers() 
	
	{
		given()
		
		
		.when()
		.get("https://www.google.com/")
		
		.then()
	     .header("Content-Type", "text/html; charset=ISO-8859-1")
	     .log().all() ;
		
	
		
		
		
		
		
		
	}

}
