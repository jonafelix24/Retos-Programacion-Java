package dev.silenzz.retos.nivel_1.invertir_valores;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class InvertValuesTest {

    @Test
    void test1() {
        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
    
    @Test
    void test2() {
        int[] input = new int[] {-1,2,-3,4,-5};
        int[] expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
    
    @Test
    void test3() {
        int[] input = new int[] {};
        int[] expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }
    
    @Test
    void test4() {
        int[] input = new int[] {0};
        int[] expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

}
