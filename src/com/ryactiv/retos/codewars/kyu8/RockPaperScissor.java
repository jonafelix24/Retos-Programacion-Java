package com.ryactiv.retos.codewars.kyu8;

/*
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"

Scissors -> Paper -> Rock ->
 */

public class RockPaperScissor {
	
	public static String rps(String p1, String p2) {
		if (p1.equals(p2)) {
			return "Draw!";
		}
		
		String matchP1P2 = p1 + p2;
		
		if (matchP1P2.equals("scissorspaper") || 
				matchP1P2.equals("paperrock") || 
				matchP1P2.equals("rockscissors")) {
			return "Player 1 won!";
		}
		
		return "Player 2 won!";
	}
	
	public static void test() {
		boolean case1 = rps("scissors", "paper").equals("Player 1 won!");
		boolean case2 = rps("scissors", "rock").equals("Player 2 won!");
		boolean case3 = rps("paper", "paper").equals("Draw!");
		
		System.out.println("Test 1: " + case1);
		System.out.println("Test 2: " + case2);
		System.out.println("Test 3: " + case3);
	}

}
