package creaturesGame;

public class Sponge extends Creature{
	int maxWaterLevels=20;
	public Sponge(String name, int initialWater) {
		super(name, initialWater);
		distance +=0;
	}
	@Override
	public void sunnyDay() {
		initialwater -=4;
		distance =0;
	}
	@Override
	public void cloudyDay() {
		initialwater -=1;
		distance =1;
		
	}
	@Override
	public void rainyDay() {
		initialwater +=6;
		distance +=3;
	}
	@Override
	public void getWinner() {
		
	}
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
