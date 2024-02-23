import org.example.DarkestPixelFinder;
import org.example.DarkestPixelPrinter;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class DarkestPixelPrinterTest {

    @Test
    public void testPrintDarkestPixels() {
        // Kép adatok mockolása
        int[][][] image = new int[360][640][3]; // Példaként létrehozhat egy megfelelő méretű képet

        // Legkisebb összegű pixelek mockolása
        List<int[]> darkestPixels = new ArrayList<>();
        darkestPixels.add(new int[]{1, 1});

        // Tesztelendő metódus hívása
        DarkestPixelPrinter.printDarkestPixels(darkestPixels, image);
    }
}
