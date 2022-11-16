package com.minvoo._0005_total_amount_of_points;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChampionshipTest {


    @Test
    public void shouldReturnTotalPoints() {

        assertEquals(30, Championship.points(new String[] {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
        assertEquals(10, Championship.points(new String[] {"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }

}