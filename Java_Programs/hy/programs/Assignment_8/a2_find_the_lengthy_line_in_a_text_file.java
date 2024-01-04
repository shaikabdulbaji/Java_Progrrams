package Assignment_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class a2_find_the_lengthy_line_in_a_text_file {

	public static void main(String[] args) throws Exception {

			File file = new File("./Sample1.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = new String();
			String lengthyline = new String();
			
			while((line = br.readLine()) != null)
			{
				if(line.length() > lengthyline.length())
					lengthyline = line;
					
			}
			br.close();
			
			System.out.println("Lengthy Line is --> " +lengthyline);
	}

}
