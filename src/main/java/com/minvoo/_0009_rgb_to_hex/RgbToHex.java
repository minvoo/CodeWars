package com.minvoo._0009_rgb_to_hex;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        if (r < 0) r = 0;
        if (r > 255) r = 255;
        if (g < 0) g = 0;
        if (g > 255) g = 255;
        if (b < 0) b = 0;
        if (b > 255) b = 255;
        return convert(r) + convert(g) + convert(b);
    }

    static String convert(int n) {
        char[] hexaDeciNum = new char[2];
        int i = 0;
        while (n != 0) {
            int temp;
            temp = n % 16;
            if (temp < 10) {
                hexaDeciNum[i] = (char) (temp + 48);
                i++;
            } else {
                hexaDeciNum[i] = (char) (temp + 55);
                i++;
            }

            n = n / 16;
        }

        String hexCode = "";
        if (i == 2) {
            hexCode += hexaDeciNum[1];
            hexCode += hexaDeciNum[0];
        } else if (i == 1) {
            hexCode = "0";
            hexCode += hexaDeciNum[0];
        } else if (i == 0)
            hexCode = "00";
        return hexCode;
    }
}
