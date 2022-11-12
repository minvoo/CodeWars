package com.minvoo._0002_quarter_of_the_year;

import java.util.HashMap;
import java.util.Map;

public class Kata {

    public int quarterOf(int month) {

      return (int)Math.ceil(month/3.0f);
    }
}
