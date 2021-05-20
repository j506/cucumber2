import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test2_GET {
	@Test
	public void test2_get()
	{
		Response response=get("https://reqres.in/api/users?page=1");
		System.out.println(response.asString());
		System.out.println(response.body().asString());
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.header("content-types"));
		System.out.println(response.time());
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
		
	}
	@Test
	public void test3_get()
	{
		given().get("https://reqres.in/api/users?page=1").then().statusCode(200).body("data.id[0]", equalTo(1));	
	}

}
