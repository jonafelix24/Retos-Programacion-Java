package dev.silenzz.retos.nivel_1.par_impar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class EvenOrOddTest {

    @Test
    @DisplayName("Should return \"Odd\" for num = 1")
    public void testPositiveOddNumbers() {
      assertEquals("Odd", EvenOrOdd.calc(1));
    }
    
    @Test
    @DisplayName("Should return \"Even\" for num = 2")
    public void testPositiveEvenNumbers() {
      assertEquals("Even", EvenOrOdd.calc(2));
    }
    
    @Test
    @DisplayName("Should return \"Odd\" for num = -1")
    public void testNegativeOddNumbers() {
      assertEquals("Odd", EvenOrOdd.calc(-1));
    }
    
    @Test
    @DisplayName("Should return \"Even\" for num = -2")
    public void testNegativeEvenNumbers() {
      assertEquals("Even", EvenOrOdd.calc(-2));
    }
    
    @Test
    @DisplayName("Should return \"Even\" for num = 0")
    public void testZero() {
      assertEquals("Even", EvenOrOdd.calc(0));
    }

}
