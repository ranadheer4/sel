package files;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.File;

import org.testng.Assert;

import groovy.lang.Newify;

public class Jira_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="http://localhost:8080";
		//Login Scnario
		SessionFilter session=new SessionFilter();
		String response = given().header("Content-Type","application/json").
		body("{ \r\n"
				+ "    \"username\": \"ranadheerdurgi4\",\r\n"
				+ "    \"password\": \"9963883545Durgi\"\r\n"
				+ "         }").log().all().filter(session).when().post("/rest/auth/1/session").then().log().all().extract().response().asString();
		
		String exptdMsg = "Commented from Eclipse validating the body of issue id with comment";
		
		//Add Comment
		String addcommentResponse=given().pathParam("key", "10400").log().all().header("Content-Type","application/json").
		body("{\r\n"
				+ "    \"body\": \""+exptdMsg+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js = new JsonPath(addcommentResponse);
		String commentId=js.getString("id");
		
		//Add Attachement
		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10400").header("Content-Type","multipart/form-data").
		multiPart("file", new File("jira.txt")).when().post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
		
		//Get Issue
		String issueDetails=given().filter(session).pathParam("key", "10400").queryParam("fields","comment").log().all().when().get("/rest/api/2/issue/{key}").
		then().log().all().extract().response().asString();
		System.out.println(issueDetails);
		
		JsonPath js1=new JsonPath(issueDetails);
		int commentCount=js1.getInt("fields.comment.comments.size()");
		for (int i=0;i<commentCount;i++) {
			String commentIdIssue=js1.get("fields.comment.comments["+i+"].id").toString();
			System.out.println(commentIdIssue);
			if(commentIdIssue.equalsIgnoreCase(commentId))
			{
				String message =  js1.get("fields.comment.comments["+i+"].body").toString();
				System.out.println(message);
				Assert.assertEquals(message, exptdMsg);
			}
		}
		
	}
}