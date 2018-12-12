package creaturesGame;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class MainCompetition {	

	public static void main(String[] args) throws FileNotFoundException, InvalidInputException{
		CreatureDataBase cdb = new CreatureDataBase();
		
		try {
		
			cdb.read("data.txt");
			cdb.report();
			cdb.getMaxValue();		
			}catch(FileNotFoundException ex ) {
				System.out.println("FileNotFound!");
				 System.exit(-1);
			} catch (InputMismatchException ex) {
	            ex.printStackTrace();
	            System.exit(-1);
	        }			
	}
}
