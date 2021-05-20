import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Test_POST {
	//@Test
	public void test2_post()
	{
		//Map<String,Object> map=new HashMap<String,Object>();
		//map.put("name", "jagannath");
		//map.put("job", "learner");
		//System.out.println(map);
		JSONObject request=new JSONObject();
		request.put("name","jagannath");
		request.put("job","learner");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().post("https://reqres.in/api/users").
		then().statusCode(201);
	}
	@Test
	public void test1_post()
	{
		//Map<String,Object> map=new HashMap<String,Object>();
		//map.put("name", "jagannath");
		//map.put("job", "learner");
		//System.out.println(map);
		JSONObject request=new JSONObject();
		request.put("name","jagannath1");
		request.put("job","learner");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().put("https://reqres.in/api/users").
		then().statusCode(200).log().all();
	}
	//@Test
	public void test3_patch()
	{
		//Map<String,Object> map=new HashMap<String,Object>();
		//map.put("name", "jagannath");
		//map.put("job", "learner");
		//System.out.println(map);
		JSONObject request=new JSONObject();
		request.put("name","jagannath1");
		request.put("job","learner");
		System.out.println(request);
		System.out.println(request.toJSONString());
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	}
	//@Test
	public void test4_delete()
	{
		//Map<String,Object> map=new HashMap<String,Object>();
		//map.put("name", "jagannath");
		//map.put("job", "learner");
		//System.out.println(map);
		JSONObject request=new JSONObject();
		request.put("name","jagannath1");
		request.put("job","learner");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	}
	

}
