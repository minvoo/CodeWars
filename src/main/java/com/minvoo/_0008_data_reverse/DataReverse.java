package com.minvoo._0008_data_reverse;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class DataReverse {

    public static int[] dataReverse(int[] data) {
        final int  divideSize = 8;
        final AtomicInteger counter = new AtomicInteger();
        List<Integer> collect = Arrays.stream(data)
                .boxed()
                .collect(Collectors.toList());

        collect.stream().collect(Collectors.groupingBy(it -> counter.getAndIncrement() / divideSize))
                .values()
                .forEach(System.out::println);

        return null;
    }


    public static void main(String[] args) {
        DataReverse.dataReverse(new int[]{1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0});
    }

}
