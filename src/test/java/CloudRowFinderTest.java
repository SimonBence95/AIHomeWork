import org.example.CloudRowFinder;
import org.example.ImageReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CloudRowFinderTest {

    @Test
    public void testFindFirstCloudRow() {
        int[][][] image = ImageReader.readImage("kep.txt");
        int threshold = 10;
        int expectedResult = 103;

        int result = CloudRowFinder.findFirstCloudRow(image, threshold);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLastCloudRow() {
        int[][][] image = ImageReader.readImage("kep.txt");
        int threshold = 10;
        int expectedResult = 280;

        int result = CloudRowFinder.findLastCloudRow(image, threshold);

        assertEquals(expectedResult, result);
    }
}
