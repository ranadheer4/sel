package fisrtApi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.Payload;
import files.ReusableMethod;

public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//validate id Add place API is working as expected
		//given - all input details
		//when - Submit the API response , http methods
		//Then - Validate the response
		
		//covert of the file to String--> content of the file can convert to byte--> convert byte to String
		
		//Add place--> Update place with new Address --> Get place to validate if new address is present in response 
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Rana durgi\\API Testing\\Add place+delete\\add place.txt")))).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		
		System.out.println(response);
		JsonPath js=new JsonPath(response);
		String placeId=js.getString("place_id");
		
		System.out.println(placeId);
		
		//Update Place
		
		String newAddress="NstarX India Pvt Ltd, USAPA";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\"NstarX India Pvt Ltd, USAPA\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}").
		when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//Get Place
		String getPlaceResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		
		JsonPath jsplace=ReusableMethod.rawToJson(getPlaceResponse);
		String actualAddress=jsplace.getString("address");
		
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
		
		
		
	}

}
 



