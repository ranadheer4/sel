package march25;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		//useful for dynamic growth of array
		ArrayList<String>week = new ArrayList<String>();
		//ArrayList<String>week = new Array_List()<String>();
		week.add("sunday");
		week.add("monday");
		week.add("tuesday");
		week.add("wednesday");
		week.add("thursday");
		week.add("friday");
		week.add("saturday");
		System.out.println(week.get(6));
		for (int i=0;i<week.size();i++)
		{
			System.out.println(week.get(i));
		}
	}

}
