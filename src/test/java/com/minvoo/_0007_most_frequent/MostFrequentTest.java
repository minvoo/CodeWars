package com.minvoo._0007_most_frequent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentTest {


    @Test
    public  void  shouldReturnMostFrequent() {
        assertEquals(9, MostFrequent.mostFrequentItemCount(new int[] {1,1,1,1,1,1,1,1,3,3,3,3,32,6,4,2,1,7,5,4,3,3}));
    }

}