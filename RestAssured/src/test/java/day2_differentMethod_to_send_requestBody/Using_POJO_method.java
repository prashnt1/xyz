package day2_differentMethod_to_send_requestBody;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Using_POJO_method {
	

	@Test
	void POJO_method() {
		POJO_body data =new POJO_body();
		data.setName("radhey");
		data.setCourse("methdology");
		
		
		given()
		.contentType("application/json")
		.body(data)
		  
			
		.when()
		.post("http://localhost:3000/student")
        
		.then()
		.statusCode(201)
		.body("name", equalTo ("radhey"))
		.log().all();
		
		
	}


}
