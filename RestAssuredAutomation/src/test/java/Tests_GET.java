import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
public class Tests_GET {
	@Test
	public void tests_get()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7)).body("data.first_name", hasItems("Michael","Lindsay")).log().all();
	}
	@Test
	public void tests2_get()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.header("content-type"));
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.asString());
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode,200);
	    
		
		
	}

}
