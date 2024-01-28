package com.ryactiv.retos.codewars.kyu8;

/*
 * DESCRIPCIÓN:
 * Los lobos han sido reintroducidos en Gran Bretaña. Eres un granjero
 * de ovejas, y ahora estás plagado de lobos que se hacen pasar por ovejas. 
 * Afortunadamente, eres bueno detectándolos.
 * 
 * Advierte a la oveja que está frente al lobo que está a punto de ser devorada. 
 * Recuerda que estás parado al frente de la cola, que está al final del arreglo:
 * 
 * [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep] (TÚ ESTÁS AQUÍ AL FRENTE DE LA COLA)
 *    7      6      5      4      3            2      1
 *    
 * Si el lobo es el animal más cercano a ti, devuelve "Pls go away and stop eating my sheep" 
 * (Por favor vete y deja de comer mis ovejas). De lo contrario, devuelve 
 * "Oi! Sheep number N! You are about to be eaten by a wolf!" (¡Oye! ¡Oveja número N! ¡Estás 
 * a punto de ser comido por un lobo!) donde N es la posición de la oveja en la cola.
 * 
 * Nota: siempre habrá exactamente un lobo en el arreglo.
 * 
 * Ejemplos
 * Input: ["sheep", "sheep", "sheep", "wolf", "sheep"]
 * Output: "Oi! Sheep number 1! You are about to be eaten by a wolf!"
 * 
 * Input: ["sheep", "sheep", "wolf"]
 * Output: "Pls go away and stop eating my sheep"
 */

public class ZywOo {
	
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
	
	public static void test() {
		String test1 = ZywOo.warnTheSheep(new String[] { "sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep" });
		String test2 = ZywOo.warnTheSheep(new String[] { "sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep" });
		String test3 = ZywOo.warnTheSheep(new String[] { "wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep" });
		String test4 = ZywOo.warnTheSheep(new String[] { "sheep", "wolf", "sheep" });
		String test5 = ZywOo.warnTheSheep(new String[] { "sheep", "sheep", "wolf" });
		
		String result1 = "Oi! Sheep number 2! You are about to be eaten by a wolf!";
		String result2 = "Oi! Sheep number 5! You are about to be eaten by a wolf!";
		String result3 = "Oi! Sheep number 6! You are about to be eaten by a wolf!";
		String result4 = "Oi! Sheep number 1! You are about to be eaten by a wolf!";
		String result5 = "Pls go away and stop eating my sheep";
		
		System.out.println("Test 1: " + result1.equals(test1));
		System.out.println("Test 2: " + result2.equals(test2));
		System.out.println("Test 3: " + result3.equals(test3));
		System.out.println("Test 4: " + result4.equals(test4));
		System.out.println("Test 5: " + result5.equals(test5));
	}

}
