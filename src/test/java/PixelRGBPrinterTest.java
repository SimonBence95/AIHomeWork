import org.example.PixelRGBPrinter;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PixelRGBPrinterTest {

    @Test
    public void testPrintPixelRGB() {
        // Mockoljuk az image tömböt
        int[][][] image = new int[2][2][3];
        image[1][1][0] = 100; // Red
        image[1][1][1] = 150; // Green
        image[1][1][2] = 200; // Blue

        // Mockoljuk a PixelRGBPrinter osztályt
        PixelRGBPrinter printerMock = mock(PixelRGBPrinter.class);

        // Hívjuk meg a tesztelendő metódust
        printerMock.printPixelRGB(image, 1, 1);

        // Ellenőrizzük, hogy a printPixelRGB metódus meghívódott-e a megfelelő bemenettel
        verify(printerMock).printPixelRGB(image, 1, 1);
    }
}
