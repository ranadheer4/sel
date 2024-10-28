package march24;

public class Switch {

	public static void main(String[] args) {
		// store courses into switch
		String course = "selenium";
		switch(course)
		{
		case  "manual":
			System.out.println("course is available");
		break;
		case "selenium":
			System.out.println("course is available");
		case "qtp":
			System.out.println("course is available");
		break;
		default:
			System.out.println("course is not available");
	
		}
		

	}

}
