package Assignment_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class a6_update_the_existing_text_into_uppercase_in_a_text_file {

	public static void main(String[] args) throws Exception {

			File file = new File("./Sample1.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = new String();
			String text = new String();
			
			while((line = br.readLine()) != null)
			{
				text = text + line.toUpperCase() + "\n";
			}
			text = text.substring(0, text.length()-1);
			// text.lastIndexOf("\n") (OR) text.length()-1
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(text);
			bw.flush();
			bw.close();
			
			br.close();
			
			System.out.println("Updated --> ");
	}

}
