package dev.silenzz.retos.nivel_1.lobo_oveja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZywOoTest {

	@Test
	void test1() {
		String[] input = new String[] { "sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep" };
		assertEquals(
				"Oi! Sheep number 2! You are about to be eaten by a wolf!", 
				ZywOo.warnTheSheep(input));
	}
	
	@Test
	void test2() {
		String[] input = new String[] { "sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep" };
		assertEquals(
				"Oi! Sheep number 5! You are about to be eaten by a wolf!", 
				ZywOo.warnTheSheep(input));
	}
	
	@Test
	void test3() {
		String[] input = new String[] { "wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep" };
		assertEquals(
				"Oi! Sheep number 6! You are about to be eaten by a wolf!", 
				ZywOo.warnTheSheep(input));
	}
	
	@Test
	void test4() {
		String[] input = new String[] { "sheep", "wolf", "sheep" };
		assertEquals(
				"Oi! Sheep number 1! You are about to be eaten by a wolf!", 
				ZywOo.warnTheSheep(input));
	}
	
	@Test
	void test5() {
		String[] input = new String[] { "sheep", "sheep", "wolf" };
		assertEquals(
				"Pls go away and stop eating my sheep", 
				ZywOo.warnTheSheep(input));
	}

}
