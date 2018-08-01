package Lab13;

public class RandomPlayer extends Player{
	
	public RandomPlayer (String name) {
		super(name);
	}
	public Roshambo generateRoshambo() {
		//get random rock paper or scissors
		int rIndex = (int) Math.random() * 3 ;
		
		return Roshambo.values()[rIndex];
		
//		switch (random) {
//			case 1:
//				return Roshambo.Rock;
//			case 2:
//				return Roshambo.Paper;
//			case 3:
//				return Roshambo.Scissors;
//		}	return null;
	}
}