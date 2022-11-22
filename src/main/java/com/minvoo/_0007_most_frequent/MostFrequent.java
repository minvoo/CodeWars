package com.minvoo._0007_most_frequent;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequent {

    public static int mostFrequentItemCount(int[] collection){
        Map<Integer, Integer> countMap = Arrays.stream(collection)
                .boxed()
                .collect(Collectors.groupingBy(e -> e,
                        Collectors.reducing(0, e -> 1, Integer::sum)));

        return Collections.max(countMap.values());

    }
}
