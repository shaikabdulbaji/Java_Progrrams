package Assignment_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class a3_find_the_number_of_words_present_in_a_line {

	public static void main(String[] args) throws Exception {

			File file = new File("./Sample1.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = new String();
			int wordCount = 0;
			
			while((line = br.readLine()) != null)
			{
				wordCount = wordCount + line.split(" ").length;
			}
			br.close();
			
			System.out.println("Number of Words --> " +wordCount);
	}

}
