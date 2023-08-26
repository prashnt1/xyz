import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileReader;




class Using_external_JsonFile {
   
	void Externaljsonfile()
	{
			
	
		
			
		File f=new File(".\\body.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		
				
	
	given()
	.contentType("application/json")
	.body(jt)
	  
		
	.when()
	.post("http://localhost:3000/student")
    
	.then()
	.statusCode(201)
	.body("name", equalTo ("ram"))
	.log().all();
	
	
}

}
