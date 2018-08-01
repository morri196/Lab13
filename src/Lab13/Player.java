package Lab13;

public abstract class Player {
	private String name;
	
	//constructor (constructors have no return type and they have the same name as the class.)
	public Player(String name) {
		super();
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}
	//return one of rock, paper, scissors
	public abstract Roshambo generateRoshambo();
	
	public String toString() {
		return "Player" + name;
	}
}
