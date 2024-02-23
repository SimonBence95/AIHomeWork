package org.example;

import java.util.ArrayList;
import java.util.List;

public class DarkestPixelFinder {

    public static int findMinSum(int[][][] image) {
        if (image == null) {
            throw new IllegalArgumentException("A kép nem lehet null!");
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 640; j++) {
                int sum = image[i][j][0] + image[i][j][1] + image[i][j][2];
                if (sum < minSum) {
                    minSum = sum;
                }
            }
        }
        return minSum;
    }


    public static List<int[]> findDarkestPixels(int[][][] image, int minSum) {
        List<int[]> darkestPixels = new ArrayList<>();
        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 640; j++) {
                int sum = image[i][j][0] + image[i][j][1] + image[i][j][2];
                if (sum == minSum) {
                    darkestPixels.add(new int[]{i, j});
                }
            }
        }
        return darkestPixels;
    }
}
