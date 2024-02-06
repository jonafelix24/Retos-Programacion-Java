package dev.silenzz.retos.nivel_1.edad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AgeDiffTest {

    @Test
    void testAgeYearsOld() {
        assertEquals("You are 4 years old.", AgeDiff.CalculateAge(2020, 2024));
        assertEquals("You are 27 years old.", AgeDiff.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", AgeDiff.CalculateAge(2000, 2090));
        assertEquals("You are 2000 years old.", AgeDiff.CalculateAge(900, 2900));
    }
    
    @Test
    void testAgeYearOld() {
        assertEquals("You are 1 year old.", AgeDiff.CalculateAge(2023, 2024));
    }
    
    @Test
    void testAgeWillBornYears() {
        assertEquals("You will be born in 10 years.", AgeDiff.CalculateAge(2004, 1994));
        assertEquals("You will be born in 110 years.", AgeDiff.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", AgeDiff.CalculateAge(2010, 1500));
    }
    
    @Test
    void testAgeWillBornYear() {
        assertEquals("You will be born in 1 year.", AgeDiff.CalculateAge(2000, 1999));
    }
    
    @Test
    void testAgeWereBorn() {
        assertEquals("You were born this very year!", AgeDiff.CalculateAge(3034, 3034));
    }

}
