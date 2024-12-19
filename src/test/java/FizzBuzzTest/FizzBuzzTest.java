package FizzBuzzTest;

import FizzBuzz.FizzBuzz;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @Test
    public void testFizzBuzz4() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(4) ;
        //THEN
        assertThat(result).isEqualTo("4");
    }

    @Test
    public void testFizzBuzz5() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(5) ;
        //THEN
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void testFizzBuzz6() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(6) ;
        //THEN
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void testFizzBuzz15() {
        //GIVEN
        //WHEN
        String result = fizzbuzz.FizzBuzzde(15) ;
        //THEN
        assertThat(result).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "3, 'Fizz'",
            "4, '4'",
            "5, 'Buzz'",
            "6, 'Fizz'",
            "7, '7'",
            "8, '8'",
            "9, 'Fizz'",
            "10, 'Buzz'",
            "11, '11'",
            "12, 'Fizz'",
            "13, '13'",
            "14, '14'",
            "15, 'FizzBuzz'",
            "16, '16'",
            "17, '17'",
            "18, 'Fizz'",
            "19, '19'",
            "20, 'Buzz'"
    })

    void testFizzBuzz(int input, String expected) {
        // Appel de la fonction
        String result = FizzBuzz.FizzBuzzde(input);

        // Vérification avec AssertJ
        assertThat(result).isEqualTo(expected);
    }



}
