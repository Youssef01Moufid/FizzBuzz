package FizzBuzzTest;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    private FizzBuzz fizzbuzz;
    @BeforeEach
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }
    @AfterEach
    public void tearDown() {
        fizzbuzz = null;
    }
    @Test
    public void testFizzBuzz1() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(1) ;
        //THEN
        assertThat(result).isEqualTo("1");
    }
    @Test
    public void testFizzBuzz2() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(2) ;
        //THEN
        assertThat(result).isEqualTo("2");
    }
    @Test
    public void testFizzBuzz3() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(3) ;
        //THEN
        assertThat(result).isEqualTo("Fizz");
    }
}
