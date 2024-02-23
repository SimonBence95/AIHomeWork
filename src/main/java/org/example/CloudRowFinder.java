package org.example;

public class CloudRowFinder {

    public static int findFirstCloudRow(int[][][] image, int threshold) {
        for (int i = 0; i < 360; i++) {
            if (SkyCloudBorderDetector.hatar(image, i, threshold)) {
                return i + 1; // Mivel az indexelés 0-tól indul, hozzáadunk egyet
            }
        }
        return -1; // Ha nem találtunk felhősorot
    }

    public static int findLastCloudRow(int[][][] image, int threshold) {
        for (int i = 359; i >= 0; i--) {
            if (SkyCloudBorderDetector.hatar(image, i, threshold)) {
                return i + 1; // Mivel az indexelés 0-tól indul, hozzáadunk egyet
            }
        }
        return -1; // Ha nem találtunk felhősorot
    }
}
