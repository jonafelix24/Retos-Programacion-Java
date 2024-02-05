package dev.silenzz.retos.nivel_1.piedra_papel_tijera;

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

}
