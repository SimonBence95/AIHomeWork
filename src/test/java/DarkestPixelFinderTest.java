import org.example.DarkestPixelFinder;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DarkestPixelFinderTest {

    @Test
    public void testFindMinSum() {
        int[][][] image = new int[360][640][3]; // 360x640 méretű üres kép
        int expectedMinSum = 0; // Mivel az összes pixel értéke 0, a legkisebb összeg is 0

        int actualMinSum = DarkestPixelFinder.findMinSum(image);

        assertEquals(expectedMinSum, actualMinSum);
    }

    @Test
    public void testFindDarkestPixels() {
        int[][][] image = new int[360][640][3]; // 360x640 méretű üres kép
        int minSum = 0; // Mivel az összes pixel értéke 0, a legkisebb összeg is 0

        List<int[]> darkestPixels = DarkestPixelFinder.findDarkestPixels(image, minSum);

        // Az elvárt eredmény: a teljes kép
        assertEquals(360 * 640, darkestPixels.size());

        // Ellenőrzés: minden pixel a legkisebb összeghez tartozik-e
        for (int[] pixel : darkestPixels) {
            int i = pixel[0];
            int j = pixel[1];
            int sum = image[i][j][0] + image[i][j][1] + image[i][j][2];
            assertEquals(minSum, sum);
        }
    }
}
