package com.minvoo._0004_split_strings;

import java.util.Arrays;

public class StringSplit {

    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] split = s.split("(?<=\\G.{" + 2 + "})");

        return split;
    }
}
