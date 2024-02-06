package dev.silenzz.retos.nivel_1.repetir_texto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RepeatStrTest {

    @Test
    public void test4a() {
        assertEquals("aaaa", RepeatStr.repeat(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", RepeatStr.repeat(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", RepeatStr.repeat(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", RepeatStr.repeat(0, "kata"));
    }

    @Test
    public void test4null() {
        assertEquals("", RepeatStr.repeat(4, null));
    }

    @Test
    public void test1kata() {
        assertEquals("kata", RepeatStr.repeat(1, "kata"));
    }

}
