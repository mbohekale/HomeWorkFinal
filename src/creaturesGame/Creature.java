package creaturesGame;

import java.util.ArrayList;
import java.util.Vector;

public abstract class Creature {
	 String name;
	 int maxWaterLevels;
	 Boolean living;
	 int distance;
	 ArrayList<Integer> waters;
	 ArrayList<Integer> distances;
	 int  initialwater;
	 String type;
	 public Creature(String name, int initialWater) {
			this.name=name;	
			this.initialwater=initialWater;
			this.distance = distance;
			this.living=living;
			distances=new ArrayList<>();
		}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setInitialWater(int initialwater) {
		this.initialwater=initialwater;
	}
	public int getInitialWater() {
		return initialwater;
	}	 
	
	public void addWater(int water) {
		waters.add(water);		
	}
	public void addDistances(int distance) {
		waters.add(distance);		
	}
	public abstract int getDistance();
	public abstract boolean isAlive();
	public abstract void sunnyDay();
	public abstract void cloudyDay();
	public abstract void rainyDay();
	public abstract void getWinner();
	
	public String toString() {
	return"Name : "+ name+" , " +"Initial Water :"+initialwater; 
	}

}
