package dev.silenzz.retos.nivel_1.piedra_papel_tijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RockPaperScissorTest {

    @Test
    void test1() {
        assertEquals("Player 1 won!", RockPaperScissor.rps("scissors", "paper"));
    }

    @Test
    void test2() {
        assertEquals("Player 2 won!", RockPaperScissor.rps("scissors", "rock"));
    }

    @Test
    void test3() {
        assertEquals("Draw!", RockPaperScissor.rps("scissors", "scissors"));
    }

    @Test
    void test4() {
        assertEquals("Player 2 won!", RockPaperScissor.rps("paper", "scissors"));
    }

    @Test
    void test5() {
        assertEquals("Player 1 won!", RockPaperScissor.rps("paper", "rock"));
    }

    @Test
    void test6() {
        assertEquals("Draw!", RockPaperScissor.rps("paper", "paper"));
    }

    @Test
    void test7() {
        assertEquals("Player 1 won!", RockPaperScissor.rps("rock", "scissors"));
    }

    @Test
    void test8() {
        assertEquals("Player 2 won!", RockPaperScissor.rps("rock", "paper"));
    }

    @Test
    void test9() {
        assertEquals("Draw!", RockPaperScissor.rps("rock", "rock"));
    }

}
