import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner; 
import java.io.*;

public class OompaLoompaSong{
	private int lines;
	//constractor
	public OompaLoompaSong(int lines){
		this.lines=lines;
	}
	
	public int getLines(){
		return lines;
	}
	public void setLines(int lines){
		this.lines=lines;
	}
	public String sing(){
		try{
					// Read in the file into a list of strings
			BufferedReader reader = new BufferedReader(new FileReader("OompaLoompaSong.txt"));
			List<String> lines = new ArrayList<String>();

			String line = reader.readLine();

			while( line != null ) {
				lines.add(line);
				line = reader.readLine();
			}

			// Choose a random one from the list
			Random r = new Random();
			String randomString = lines.get(r.nextInt(lines.size()));
			System.out.println( randomString);
		
		}catch(Exception e){
			System.out.println(e);
		}
	return "";
	}
	
	public String toString(){
		return""+lines;
	}
	public void equals(){}
}