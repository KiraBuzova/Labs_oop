import filters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImageProcessingTest {
    @Test
    void testBlackAndWhiteFilter() {
        FilterFactory factory = new BlackAndWhiteFilterFactory();
        ImageFilter filter = factory.createFilter();
        assertNotNull(filter, "Filter should be created");
    }

    @Test
    void testBlurFilter() {
        FilterFactory factory = new BlurFilterFactory();
        ImageFilter filter = factory.createFilter();
        assertNotNull(filter, "Filter should be created");
    }

    @Test
    void testBrightnessFilter() {
        FilterFactory factory = new BrightnessFilterFactory();
        ImageFilter filter = factory.createFilter();
        assertNotNull(filter, "Filter should be created");
    }
}
