package org.example;

public class BrightPixelCounter {

    public static int countBrightPixels(int[][][] image) {
        int count = 0;
        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 640; j++) {
                int sum = image[i][j][0] + image[i][j][1] + image[i][j][2];
                if (sum > 600) {
                    count++;
                }
            }
        }
        return count;
    }
}
