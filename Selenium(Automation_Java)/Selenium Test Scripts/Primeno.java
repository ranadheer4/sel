package march24;

public class Primeno {

	public static void main(String[] args) {
		// printing prime no
		int n=100;
		for (int i=1;i<=n;i++)
		{
			boolean flag=true;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;			
				}
			}
			if(flag)
			{
				System.out.println(i+" ");
			}

		}

	}

}
