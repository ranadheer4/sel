package apirll_15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Newfile_notepad {

	public static void main(String[] args) throws Throwable {
		// create new file
		File f = new File("D://sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("i am learning selenium");
		bw.newLine();
		bw.write("i am learning manual");
		bw.newLine();
		bw.write("II am learning testing tools");
		bw.flush();
		bw.close();
	}

}
