package creaturesGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CreatureDataBase {
	ArrayList<Creature> creatures=new ArrayList<>();
		
	public CreatureDataBase() {
		
		creatures=new ArrayList<>();
	}
	
public void read(String filename) throws FileNotFoundException, InvalidInputException {
		
			Scanner sc = new Scanner(new BufferedReader(new FileReader("data.txt")));
			int numCreatures=sc.nextInt();
				for(int i=0;i<numCreatures;i++){
				Creature creature;
				String name=sc.next();
				String type =sc.next();
				int initialWater =sc.nextInt();
				
				switch(type) {
				case "r":
					creature= new Sandrunner(name,initialWater);
					break;
				case "s":
					creature = new Sponge(name,initialWater);
					break;
				case "w":
					creature = new Walker(name,initialWater);
					break;
				default:
					System.out.println(type);
					throw new InvalidInputException();
				}
				creatures.add(creature);
			}
				String days;
				days=sc.next();
				for(int i=0;i<days.length();i++){
					System.out.println(days);
					for(Creature creature: creatures) 
						
					{
					switch(days) {
					case "s":
						creature.sunnyDay();
						
						break;
					case "c":
						creature.rainyDay();
						break;
					case "r":
						creature.cloudyDay();
						break;
					}
					}
						
					
					}
					
				}
	
	
									
				public void report() {
		        System.out.println("Creatures in the database:");
		        for (Creature v : creatures) {
		            System.out.println(v);
		        }
		        
		        System.out.println("Winning Creature");
		        int[] creatures= {4,7,12,10};
		        int winner= creatures[0];
		        for(int count=0;count<creatures.length;count++) {
		        	if(creatures[count]>winner) 
		        	{
		        		winner =creatures[count];
		        	}		        		
		        }
		        System.out.println("Winner waterLevel is:"+" "+winner);
		     }
	
		
	
	public int getMaxValue() {
					 int maxValue=creatures.get(0).distance;				    
				    for (int i = 0; i < creatures.size(); i++) {
				        if (creatures.get(i).distance < maxValue) {
				            maxValue = creatures.get(i).distance;
				        }
				    }
				    return maxValue;
				}
	
	
}
