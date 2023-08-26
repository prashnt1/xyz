package day2_differentMethod_to_send_requestBody;
	import org.testng.annotations.Test;
	import static io.restassured.RestAssured.*;
	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;

import java.util.HashMap;
public class Using_Hashmap_Method {
	
	
	@Test
	void response_bodyUsing_hashmap() {
		
		HashMap data =new HashMap();
		data.put("name","Sooraj");
		data.put("course","aerocraft");
		
		
		given()
		.contentType("application/json")
		.body(data)
		
		
		.when()
		.post("http://localhost:3000/student")
        
		.then()
		.statusCode(201)
		.body("name", equalTo ("Sooraj"))
		.log().all();
		
		
	}

}
