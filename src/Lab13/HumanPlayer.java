package Lab13;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	private Scanner scnr;

	// constructor
	public HumanPlayer(String name, Scanner scnr) {
		super(name);
		this.scnr = scnr;
	}

	@Override
	public Roshambo generateRoshambo() {
		String choice = Validator.getStringMatchingRegex(scnr,  
				"Would you like to play rock, paper, scissors?", "rock|paper|scissors");
		if (choice.equals("rock")) {
			return Roshambo.Rock;
		}	else if (choice.equals("paper")) {
			return Roshambo.Paper;
		}	else  {
			return Roshambo.Scissors;
		} 
	}
	

	
}
