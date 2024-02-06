package dev.silenzz.retos.nivel_1.lobo_oveja;

public class ZywOoSolucion {

    public static String warnTheSheep(String[] array) {
        int sheepNum = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals("wolf")) {
                break;
            }
            sheepNum++;
        }

        if (sheepNum > 0) {
            return "Oi! Sheep number " + sheepNum + "! You are about to be eaten by a wolf!";
        }

        return "Pls go away and stop eating my sheep";
    }

}
