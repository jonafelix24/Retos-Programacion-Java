package dev.silenzz.retos.nivel_1.negativo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReturnNegativeTest {

    @Test
    void test1() {
        assertEquals(-5, ReturnNegative.makeNegative(5));
    }

    @Test
    void test2() {
        assertEquals(-2, ReturnNegative.makeNegative(-2));
    }

    @Test
    void test3() {
        assertEquals(0, ReturnNegative.makeNegative(0));
    }

}
