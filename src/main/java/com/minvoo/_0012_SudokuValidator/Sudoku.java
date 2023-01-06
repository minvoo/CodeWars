package com.minvoo._0012_SudokuValidator;

import java.util.HashMap;
import java.util.Map;

public class Sudoku {

    public static boolean check(int[][] sudoku) {
        int rows = 9;
        int cols = rows;
        sudoku = new int[rows][cols];

        Map<Integer,Integer> counterCol = new HashMap<>();
        for(int row = 0; row < rows; row++) {
            Map<Integer,Integer> counterRow = new HashMap<>();
            for(int col = 0; col < cols; col++) {
                if (counterRow == null) {
                    counterRow.put(col, 1);
                }
                if (counterRow.containsKey(Integer.valueOf(col)) || col == 0) {
                    return false;
                }
                if (row== 9-1) {
                    counterCol = null;
                }
            }
            if (counterCol == null){
                counterCol.put(row,1);
            }
            if (counterCol.containsKey(Integer.valueOf(row)) || row == 0) {
                return false;
            }
        }

        return true;

    }
}
