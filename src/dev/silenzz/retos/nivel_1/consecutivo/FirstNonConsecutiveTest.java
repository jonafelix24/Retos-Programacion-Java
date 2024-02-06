package dev.silenzz.retos.nivel_1.consecutivo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FirstNonConsecutiveTest {

    @Test 
    public void basicTests1() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 6, 7, 8}));  
    }
    
    @Test 
    public void basicTests2() {
        assertEquals(null, FirstNonConsecutive.find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
    
    @Test 
    public void basicTests3() {
        assertEquals(Integer.valueOf(6), FirstNonConsecutive.find(new int[]{4, 6, 7, 8, 9, 11}));
    }
    
    @Test 
    public void basicTests4() {
        assertEquals(Integer.valueOf(11), FirstNonConsecutive.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
    }
    
    @Test 
    public void basicTests5() {
        assertEquals(null, FirstNonConsecutive.find(new int[]{31, 32}));
    }
    
    @Test 
    public void basicTests6() {
        assertEquals(Integer.valueOf(0), FirstNonConsecutive.find(new int[]{-3, -2, 0, 1}));
    }
    
    @Test 
    public void basicTests7() {
        assertEquals(Integer.valueOf(-1), FirstNonConsecutive.find(new int[]{-5, -4, -3, -1}));
    }

}
