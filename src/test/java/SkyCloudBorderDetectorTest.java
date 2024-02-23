import org.example.SkyCloudBorderDetector;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SkyCloudBorderDetectorTest {

    @Test
    public void testHatar_withThresholdExceeded() {
        // Arrange
        int[][][] image = { {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}} }; // example image
        int row = 1;
        int threshold = 10; // setting a threshold that should be exceeded

        // Mocking the image object
        // Assuming that the blue channel difference exceeds the threshold
        image[row][1][2] = 20;

        // Act
        boolean result = SkyCloudBorderDetector.hatar(image, row, threshold);

        // Assert
        assertTrue(result); // We expect the threshold to be exceeded
    }

    @Test
    public void testHatar_withThresholdNotExceeded() {
        // Arrange
        int[][][] image = { {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}} }; // example image
        int row = 1;
        int threshold = 10; // setting a threshold that should not be exceeded

        // Mocking the image object
        // Assuming that the blue channel difference does not exceed the threshold
        image[row][1][2] = 5;

        // Act
        boolean result = SkyCloudBorderDetector.hatar(image, row, threshold);

        // Assert
        assertFalse(result); // We expect the threshold not to be exceeded
    }
}
