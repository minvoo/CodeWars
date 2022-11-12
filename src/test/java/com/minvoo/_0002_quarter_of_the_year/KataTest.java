package com.minvoo._0002_quarter_of_the_year;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void shouldGetQuarter() {
        // given
        Kata kata = new Kata();
        // when & then
        assertEquals(kata.quarterOf(3), 1);
        assertEquals(kata.quarterOf(8), 3);
        assertEquals(kata.quarterOf(11), 4);
    }

}