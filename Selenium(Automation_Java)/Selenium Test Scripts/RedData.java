package apirll_15;

import java.io.BufferedReader;
import java.io.FileReader;

public class RedData {

	public static void main(String[] args) throws Throwable {
		// read a data line by line from notepad
		FileReader fr = new FileReader("D://sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = " ";
		while((str=br.readLine())!=null)
		{
			Thread.sleep(5000);
		System.out.println(str);
		}
		br.close();
	}

}
