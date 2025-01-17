package files;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {
	
	@Test
	public void addBook() {
		
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().header("Content-Type", "application/json")
		.body(Payload.addBook("xz5bz52","3545")).
		when().post("Library/Addbook.php").
		then().log().all().assertThat().statusCode(200).extract().response().asString();
		JsonPath js=ReusableMethod.rawToJson(response);
		String id =js.get("ID");
		System.out.println(id);
		
	}

}
