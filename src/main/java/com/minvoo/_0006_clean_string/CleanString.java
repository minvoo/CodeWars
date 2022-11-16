package com.minvoo._0006_clean_string;

import java.util.Arrays;

public class CleanString {

    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("");
        System.out.println(Arrays.toString(split));
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("#")) {
                sb.append(split[i]);
            } else
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length()-1);
                }
        }
        return sb.toString();
    }
}
