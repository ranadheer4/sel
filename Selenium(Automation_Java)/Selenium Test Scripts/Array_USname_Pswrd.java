package march25;

public class Array_USname_Pswrd {

	public static void main(String[] args) {
		// storing the login data of username and password(2d)
		String login[] [] = new String[5] [2];
		login[0][0]="Admin1";
		login[0][1]="Test1";
		login[1][0]="Admin2";
		login[1][1]="Test2";
		login[2][0]="Admin3";
		login[2][1]="Test3";
		login[3][0]="Admin4";
		login[3][1]="Test4";
		login[4][0]="Admin5";
		login[4][1]="Test5";
		//login[4][2]="Test6";
		//count no of rows
		System.out.println(login.length);
		System.out.println(login[0].length);
		//iterate all rows
		for(int i=0;i<login.length;i++)
		{
			for(int j=0;j<login[i].length;j++)
			{
				System.out.println(login[i][j] + " \t ");		
			}
			//System.out.println();
		}
	}

}
