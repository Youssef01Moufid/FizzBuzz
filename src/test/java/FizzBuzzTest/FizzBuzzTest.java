package FizzBuzzTest;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz1() {
        //GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        //WHEN
        String result = fizzbuzz.FizzBuzzde(1) ;
        //THEN
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void testFizzBuzz2() {
        //GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        //WHEN
        String result = fizzbuzz.FizzBuzzde(2) ;
        //THEN
        assertThat(result).isEqualTo("2");
    }
}
