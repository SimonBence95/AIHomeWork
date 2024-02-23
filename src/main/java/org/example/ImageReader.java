package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageReader {

    public static int[][][] readImage(String filename) {
        int[][][] image = new int[360][640][3];
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            for (int i = 0; i < 360; i++) {
                for (int j = 0; j < 640; j++) {
                    for (int k = 0; k < 3; k++) {
                        image[i][j][k] = scanner.nextInt();
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return image;
    }
}
