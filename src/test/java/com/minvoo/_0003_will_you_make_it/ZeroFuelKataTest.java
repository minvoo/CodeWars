package com.minvoo._0003_will_you_make_it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroFuelKataTest {

    @Test
    public void shouldReturnIfItIsPossibleToGetToThePumpOrNot() {
        assertTrue(ZeroFuelKata.zeroFuel(50,25,2));
        assertFalse(ZeroFuelKata.zeroFuel(100,50,1));
    }

}