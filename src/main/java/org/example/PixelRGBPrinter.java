package org.example;

public class PixelRGBPrinter {

    public static void printPixelRGB(int[][][] image, int row, int column) {
        System.out.print("A képpont színe RGB");
        System.out.print("("+image[row][column][0]+",");
        System.out.print(image[row][column][1]+",");
        System.out.print(image[row][column][2]+")");
        System.out.println("");
    }
}
