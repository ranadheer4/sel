package march25;

public class Objectarray {

	public static void main(String[] args) {
		// 1D array with object
		Object str[] = new Object[5];
		str[0]=2345;
		str[1]="hello";
		str[2]='f';		
		str[3]=2345;
		str[4]="true";
		for(Object each:str)
		{
			System.out.println(each);
			
		}

	}

}
