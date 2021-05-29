package com.whnm.javatest.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void returnFizzWhenNumberDivisibleBy3() {

        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));

    }

    @Test
    public void returnBuzzWhenNumberDivisibleBy5() {

        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));

    }

    @Test
    public void returnFizzBuzzWhenNumberDivisibleBy3And5() {

        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));

    }

    @Test
    public void returnSameNumberInOtherCase() {

        assertEquals("4", FizzBuzz.fizzBuzz(4));

    }
}