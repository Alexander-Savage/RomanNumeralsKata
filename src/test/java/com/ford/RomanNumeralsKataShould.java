package com.ford;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class RomanNumeralsKataShould {

//    Try to run this test, it should pass!
    @Test
    void returnNumerals() {
        assertThat(RomanNumeralsKata.convertToNumerals(""), equalTo(0));
    }


//    Broken test, how could you fix this?
//    @Test
//    void returnNumerals() {
//        assertThat(RomanNumeralsKata.convertToNumerals("I"), equalTo(1));
//    }

//    Can you write a failing test to convert "II" to 2? and "III" to 3.
//    Remember to use Red -> Green -> Refactor
//    What about when we want to convert "V" -> 5
}
