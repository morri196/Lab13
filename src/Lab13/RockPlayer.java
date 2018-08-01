package Lab13;

public class RockPlayer extends Player{

	public RockPlayer(String name) {
		super(name);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
	}

}
