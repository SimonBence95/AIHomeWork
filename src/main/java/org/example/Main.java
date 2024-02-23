package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][][] image = ImageReader.readImage("kep.txt");

        Scanner scanner = new Scanner(System.in);
        System.out.println("2. feladat:");
        System.out.println("Kérem egy képpont adatait!");
        System.out.print("Sor: ");
        int row = scanner.nextInt();
        System.out.print("Oszlop: ");
        int column = scanner.nextInt();
        PixelRGBPrinter.printPixelRGB(image, row - 1, column - 1);

        int countBrightPixels = BrightPixelCounter.countBrightPixels(image);
        System.out.println("3. feladat:");
        System.out.println("A világos képpontok száma: " + countBrightPixels);

        int minSum = DarkestPixelFinder.findMinSum(image);
        List<int[]> darkestPixels = DarkestPixelFinder.findDarkestPixels(image, minSum);
        System.out.println("4. feladat:");
        System.out.println("A legsötétebb pont RGB összege: " + minSum);
        System.out.println("A legsötétebb pixelek színe:");
        for (int[] pixel : darkestPixels) {
            int i = pixel[0];
            int j = pixel[1];
            System.out.println("RGB(" + image[i][j][0] + ", " + image[i][j][1] + ", " + image[i][j][2] + ")");
        }

        System.out.println("6. feladat:");
            int threshold = 10;
            int firstCloudRow = CloudRowFinder.findFirstCloudRow(image, threshold);
            int lastCloudRow = CloudRowFinder.findLastCloudRow(image, threshold);
        System.out.println("Az első felhősor sorszáma: "+firstCloudRow);
        System.out.println("Az utolsó felhősor sorszáma: "+lastCloudRow);
    }
}
