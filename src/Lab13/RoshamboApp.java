package Lab13;

import java.util.Arrays;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//create user as a HumanPlayer
		System.out.println("Welcome to Rock Paper Scissors! \n");
		
		String humanName = Validator.getString(scnr, "Enter you name: \n");
		
		HumanPlayer human = new HumanPlayer(humanName, scnr);
		
		//Creates challenger as a COmputerPlayer
		int opponent = Validator.getInt(scnr, "Select opponent (1 or 2):\n", 1, 2);
		Player challenger;
		if (opponent == 1) {
			 challenger = new RandomPlayer("Randy");
			System.out.println("You are playing Randy!\n");
		}	else {
			 challenger = new RockPlayer("Rocky");
			System.out.println("You are playing Rocky!\n");
		}
		
		
		
//		System.out.println(Arrays.toString(Roshambo.values()));
//		for (Roshambo roro : Roshambo.values()) {
//			System.out.println(roro);
//		}
		//game loop structure
		String cont = "y";
		
		do {
//			RandomPlayer random = new RandomPlayer("Becky");
//			System.out.println(random.generateRoshambo());
			
			playTheGame(human, challenger);
			
		cont = Validator.getString(scnr, "Continue? y/n?");
		} while (cont.matches("[yY]"));
			
//		HumanPlayer human = new HumanPlayer(name, scnr);
//		System.out.println(human.generateRoshambo());
//		
//		RockPlayer computerPlayer = new RockPlayer("Dwayne");
//		
//		Roshambo playerChoice = computerPlayer.generateRoshambo();
//		System.out.println(playerChoice);
		
		scnr.close();
		 
		

	}

	private static void playTheGame(HumanPlayer human, Player challenger) {
		//String input = Validator.getStringMatchingRegex(scnr, "rock, paper, scissors", "rock|paper|scissors");
		Roshambo input = human.generateRoshambo();
		Roshambo computerOutput = challenger.generateRoshambo();
		
		System.out.println(input);
		System.out.println(computerOutput);
	}

}

