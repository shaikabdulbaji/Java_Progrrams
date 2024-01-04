package Assignment_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class a5_merge_two_text_files_data_into_a_new_single_text_file {

	public static void main(String[] args) throws Exception {

			File file1 = new File("./file1.txt");
			File file2 = new File("./file2.txt");
			
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			
			String line = new String();
			String text1 = new String();
			String text2 = new String();
			
			//for the first file
			while((line = br1.readLine()) != null)
			{
				text1 = text1 + line + "\n";
			}
			text1 = text1.substring(0, text1.lastIndexOf("\n"));
			
			//for the second file
			while((line = br2.readLine()) != null)
			{
				text2 = text2 + line + "\n";
			}
			text2 = text2.substring(0, text2.lastIndexOf("\n"));
			
			br1.close();
			br2.close();
			
			String text3 = text1 + "\n" + text2;
			File file3 = new File("./file3.txt");
			if(!file3.exists())
				file3.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file3));
			bw.write(text3);
			bw.flush();
			bw.close();
	}

}
