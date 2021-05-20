import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Examples {
	@Test
	public void test_get()
	{
		baseURI="http://localhost:3000/";

		given().param("name", "Automation").get("/subjects").then().statusCode(200).log().all();
	}
	//@Test
	public void test_post()
	{
		//now we are doing post operation in restassured.the post is used to i will give a body in the json format get back the response in json format
		JSONObject request=new JSONObject();
		request.put("firstname","rama");
		request.put("lastname", "raman");
		request.put("subjectId", 1);
		baseURI="http://localhost:3000/";
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().post("/users").
		then().statusCode(201);
	}
	//@Test
	public void test_patch()
	{
		//now we are doing post operation in restassured.the post is used to i will give a body in the json format get back the response in json format
		JSONObject request=new JSONObject();
		
		
		request.put("lastname", "raman");
		
		
		baseURI="http://localhost:3000/";
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().put("/users/4").
		then().statusCode(200);
	}
	//@Test
	public void test_put()
	{
		//now we are doing post operation in restassured.the post is used to i will give a body in the json format get back the response in json format
		JSONObject request=new JSONObject();
		
		request.put("firstname","raman");
		request.put("lastname", "raju");
		request.put("subjectId", 1);
		
		baseURI="http://localhost:3000/";
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().patch("/users/4").
		then().statusCode(200);
	}
	//@Test 
	public void test_delete()
	{
		baseURI="http://localhost:3000/";
		when().delete("/users/4").then().statusCode(200);
	}

}
