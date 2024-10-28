package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethod {
	
	public static JsonPath rawToJson(String getPlaceResponse) {
		JsonPath jsplace=new JsonPath(getPlaceResponse);
		return jsplace;
	}

}
