package org.example;

public class SkyCloudBorderDetector {

    public static boolean hatar(int[][][] image, int row, int threshold) {
        // Ellenőrizzük, hogy az image nem null és van elég pixel az adott sorban
        if (image == null || row < 0 || row >= image.length || image[row].length < 2) {
            return false;
        }

        for (int j = 1; j < image[row].length - 1; j++) { // Az első és az utolsó képpontot kihagyjuk
            int blueDiff = Math.abs(image[row][j][2] - image[row][j - 1][2]);
            if (blueDiff > threshold) {
                return true;
            }
        }
        return false;
    }
}
