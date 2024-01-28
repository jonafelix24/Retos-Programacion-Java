package com.ryactiv.retos.codewars.kyu8;

/*
 * En este reto se te da un número y tienes que convertirlo
 * en negativo. Pero, ¿y si el número ya es negativo?
 * 
 * Ejemplos:
 * 
 *  - Kata.makeNegative(1); // devuelve -1
 *  - Kata.makeNegative(-5); // devuelve -5
 *  - Kata.makeNegative(0); // devuelve 0
 * 
 * Notas:
 * 
 *  - El número ya puede ser negativo, en cuyo caso no se 
 *    requiere ningún cambio.
 *  - El cero (0) no se verifica para ningún signo específico. 
 *    Los ceros negativos no tienen sentido matemático.
 *    
 */

public class ReturnNegative {

	public static int makeNegative(final int x) {
		return x > 0 ? -x : x;
	}

}
