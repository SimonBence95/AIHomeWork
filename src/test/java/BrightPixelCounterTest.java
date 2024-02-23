import org.example.BrightPixelCounter;
import org.example.ImageReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrightPixelCounterTest {

    @Test
    public void testCountBrightPixels() {
        int[][][] image = ImageReader.readImage("kep.txt");
        int expectedResult = 7837; // Példa eredmény, a valós érték függ az adott képtől

        int result = BrightPixelCounter.countBrightPixels(image);

        assertEquals(expectedResult, result);
    }
}
