package com.minvoo._0005_total_amount_of_points;

public class Championship {

    public static int points(String[] games) {

        int totalPoints = 0;
        for (int i =0; i<games.length;i++) {

            String[] split = games[i].split(":");
            if (Integer.valueOf(split[0]) > Integer.valueOf(split[1])) {
                totalPoints+=3;
            } else if (Integer.valueOf(split[0]).equals(Integer.valueOf(split[1]))) {
                totalPoints+=1;
            }
        }

        return totalPoints;
    }
}
