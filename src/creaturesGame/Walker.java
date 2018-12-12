package creaturesGame;

public class Walker extends Creature{
	int maxWaterLevels=12;
	public Walker(String name, int initialWater) {
		super(name, initialWater);
		distance +=0;
	}

	@Override
	public void sunnyDay() {
		initialwater -=2;
		distance +=1;
	}

	@Override
	public void cloudyDay() {
		initialwater -=1;
		distance +=2;
		
	}

	@Override
	public void rainyDay() {
		initialwater +=3;
		distance +=1;
	}
	@Override
	public int getDistance() {
		return distance ;
	}
	@Override
	public void getWinner() {
		
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
