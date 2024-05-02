package train.the.trainer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzShould {

   @Test
   void return_1_given_1() {
       FizzBuzz fizzBuzz = new FizzBuzz();
       assertEquals("1", fizzBuzz.convert(1));
   }

    @Test
    void return_2_given_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.convert(2));
    }

    @Test
    void return_fizz_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(3));
    }

    @Test
    void return_fizz_given_6() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(6));
    }

    @Test
    void return_buzz_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(5));
    }

    @Test
    void return_buzz_given_10() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.convert(10));
    }

    @Test
    void return_fizzbuzz_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(15));
    }

    @Test
    void return_fizzbuzz_given_30() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.convert(30));
    }

    @Test
    void return_fizz_given_anything_with_a_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.convert(43));

    }
}