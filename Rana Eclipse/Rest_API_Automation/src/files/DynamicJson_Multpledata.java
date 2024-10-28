package files;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson_Multpledata {
	
	@Test(dataProvider = "BooksData")
	public void addBooks(String isbn, String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String resp=given().header("Content-Type", "application/json")
		.body(Payload.addBook(isbn,aisle)).
		when().post("Library/Addbook.php").
		then().assertThat().statusCode(200).extract().response().asString();
		JsonPath js=ReusableMethod.rawToJson(resp);
		String id =js.get("ID");
		System.out.println(id);
		
	}
	@DataProvider(name="BooksData")
	public Object[][] getData() {
		//array = collection of elements
		//multi demensional array=collection of arrays
		return new Object[][] {{"norith", "15d2345"},{"souctsh","3845z66"},{"wecst","586d788"}};
	}
	
	//Delete book
	@Test(dataProvider = "BooksData1")
	public void deleteBooks(String isbn, String aisle) {
		
		RestAssured.baseURI="http://216.10.245.166";
		String resp1=given().header("Content-Type", "application/json")
		.body("{\r\n"
				+ " \r\n"
				+ "\"ID\"\"\"+id+\": \"a23h345122332\"\r\n"
				+ " \r\n"
				+ "} ").
		when().delete("/Library/DeleteBook.php").
		then().assertThat().statusCode(200).extract().response().asString();
		JsonPath js=ReusableMethod.rawToJson(resp1);
//		String id =js.get("ID");
//		System.out.println(id);
//		
	}
	@DataProvider(name="BooksData1")
	public Object[][] getdata() {
		//array = collection of elements
		//multi demensional array=collection of arrays
		return new Object[][] {{"norith", "15d2345"},{"souctsh","3845z66"},{"wecst","586d788"}};
	}
	
}
