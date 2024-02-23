
import org.example.ImageReader;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ImageReaderTest {

    @Test
    public void testReadImage() {
        // Tesztelendő fájl neve
        String filename = "test_image.txt";

        // Tesztelendő adatok előkészítése
        int[][][] expectedImage = generateTestImage();

        // Fájl tartalmának generálása
        generateTestFile(filename, expectedImage);

        // Tesztelés
        int[][][] actualImage = ImageReader.readImage(filename);
        assertArrayEquals(expectedImage, actualImage);
    }

    private int[][][] generateTestImage() {
        // Tesztelendő kép generálása
        int[][][] image = new int[360][640][3];
        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 640; j++) {
                for (int k = 0; k < 3; k++) {
                    image[i][j][k] = i + j + k; // Példa adatok generálása
                }
            }
        }
        return image;
    }

    private void generateTestFile(String filename, int[][][] image) {
        // Tesztelendő fájl tartalmának generálása
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 360; i++) {
            for (int j = 0; j < 640; j++) {
                for (int k = 0; k < 3; k++) {
                    sb.append(image[i][j][k]).append(" ");
                }
                sb.append("\n");
            }
        }

        // Fájl írása
        try {
            File file = new File(filename);
            java.io.PrintWriter writer = new java.io.PrintWriter(file);
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
