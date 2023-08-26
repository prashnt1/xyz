package day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class httpRequest {	
	
	int id;
	@Test
	void getusers()
	{
		
		given()
		
		
		.when()
		.get("https://reqres.in/api/users?page=2")

        .then()
        .statusCode(200)
        .body("page",equalTo(2))
        .log().all();
 }	
	
	@Test
	
	void createuser()
	{
		HashMap data=new HashMap();
		data.put("name","prashant");
		data.put("job","pharmacist");
		
		
		id=given()
		.contentType("application/json")
		.body(data)
	
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id")
		;
		
		//.then()
		//.statusCode(201)
		//.log().all();
		
		
		
	}
	
	void updateUser()
	{
		HashMap data=new HashMap();
		data.put("name","prashant");
		data.put("job","tester");
		
		
		given()
		.contentType("application/json")
		.body(data)
	
		
		.when()
		.post("https://reqres.in/api/users/"+id)
		
		
		
		.then()
		.statusCode(201)
		.log().all();
		
		
		
	}
	
	
}
