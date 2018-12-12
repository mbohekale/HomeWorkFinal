package creaturesGame;

import java.util.ArrayList;
import java.util.Vector;

public class Sandrunner extends Creature{
		int maxWaterLevels=8;
	public Sandrunner(String name, int initialWater) {
		super(name, initialWater);
		distance +=0;
		
	}
	
	@Override
	public void sunnyDay() {
		initialwater -=1;
		distance +=3;
	}
	@Override
	public void cloudyDay() {
		initialwater = 0;
		distance += 1;
		
	}
	@Override
	public void rainyDay() {
		initialwater +=3;
		distance = 0;
	}
	@Override
	public  void getWinner() {}
	@Override
	public int getDistance() {
		return distance ;
	}
	@Override
	public boolean isAlive() {
		if(initialwater>0) {
			System.out.println("isAlive");
			return true;
		}else {
			System.out.println("isNotAlive");
		return false;
		}
	}

}
