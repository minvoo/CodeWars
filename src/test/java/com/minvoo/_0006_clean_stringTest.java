package com.minvoo;

import com.minvoo._0006_clean_string.CleanString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _0006_clean_stringTest {

    @Test
    public void shouldGetCleanString() {
        CleanString cleanString = new CleanString();

        assertEquals("ac", cleanString.cleanString("abc#d##c"));
        assertEquals("", cleanString.cleanString("abc####d##c#"));
    }

}