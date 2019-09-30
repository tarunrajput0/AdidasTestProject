package maven.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class demo1 
{
	@Test
	public void testcode()
	{
		Response resp = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.getStatusCode();
		ResponseBody text= resp.getBody()
		System.out.println("Status Code is :"+code);
		System.out.println("Status body is :"+text);
		
		
	}
	
}
