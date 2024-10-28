package fisrtApi;

import files.Payload;
import io.restassured.path.json.JsonPath;

public class complexJsonpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonPath js=new JsonPath(Payload.coursePrices());
		//print number of courses returned by API
		int count=js.getInt("courses.size()");
		System.out.println(count);
		//print purchase amount
		int totalAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		//print tittle of first course
		String titleFirstcourse=js.get("courses[2].title");
		System.out.println(titleFirstcourse);
		
		//Print All course titles and their respective Prices
		for(int i=0;i<count;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(courseTitles);	
		}
		
		// Print no of copies sold by RPA Course
		for(int i=0;i<count;i++)
		{
			String courseTitles=js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("Cypress"))
			{
				int copies=js.get("courses["+i+"].copies");
				System.out.println(" Print no of copies sold by Cypress Course: "  + copies);
				break;
			}
		}
			
}
}