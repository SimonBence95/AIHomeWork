package org.example;

import java.util.List;

public class DarkestPixelPrinter {

    public static void printDarkestPixels(List<int[]> darkestPixels, int[][][] image) {
        System.out.println("A legkisebb összeg: " + DarkestPixelFinder.findMinSum(image));
        System.out.println("A legkisebb összegű pixelek RGB értékei:");
        for (int[] pixel : darkestPixels) {
            int i = pixel[0];
            int j = pixel[1];
            System.out.println("RGB(" + image[i][j][0] + ", " + image[i][j][1] + ", " + image[i][j][2] + ")");
        }
    }
}
