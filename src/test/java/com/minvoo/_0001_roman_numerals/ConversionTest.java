package com.minvoo._0001_roman_numerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionTest {


    @Test
    public void shouldConvertToRoman() {
        // given
        Conversion conversion = new Conversion();
        // when & then
        assertEquals("I", conversion.solution(1));
        assertEquals( "IV", conversion.solution(4));
        assertEquals( "VI", conversion.solution(6));
        assertEquals( "L", conversion.solution(50));
    }

}