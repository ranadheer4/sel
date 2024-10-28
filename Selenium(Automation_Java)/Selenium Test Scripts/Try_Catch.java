package march26;

public class Try_Catch {

	public static void main(String[] args) {
		// divide anything with zero
		try {
			int a=456,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Throwable t)
		{
			System.out.println(t.getMessage());
			//t.printStackTrace();
		}
		double x=515151,y=98,z;
		z=x/y;
		System.out.println(z);

	}

}
