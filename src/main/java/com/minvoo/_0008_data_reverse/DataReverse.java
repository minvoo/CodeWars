package com.minvoo._0008_data_reverse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class DataReverse {

    public static int[] dataReverse(int[] data) {

        return java.util.stream.IntStream.range(0, data.length)
                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
                .toArray();
    }


    public static void main(String[] args) {
        DataReverse.dataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0});
    }

}
