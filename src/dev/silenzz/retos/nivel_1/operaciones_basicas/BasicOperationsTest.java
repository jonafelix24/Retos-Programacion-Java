package dev.silenzz.retos.nivel_1.operaciones_basicas;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class BasicOperationsTest {

    @Test
    void testBasicsSum() {
        assertThat(BasicOperations.basicMath("+", 4, 7), is(11));
    }
    
    @Test
    void testBasicsSub() {
        assertThat(BasicOperations.basicMath("-", 15, 18), is(-3));
    }
    
    @Test
    void testBasicsMul() {
        assertThat(BasicOperations.basicMath("*", 5, 5), is(25));
    }
    
    @Test
    void testBasicsDiv() {
        assertThat(BasicOperations.basicMath("/", 49, 7), is(7));
    }

}
