package com.minvoo._0003_will_you_make_it;

public class ZeroFuelKata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {

        return distanceToPump/mpg <= fuelLeft;
    }
}
