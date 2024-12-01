import filters.BlackAndWhiteFilterFactory;
import org.processing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImageProcessingExtendedTests {
    @Test
    void testColorCorrection() {
        ColorCorrection colorCorrection = new BasicColorCorrection();
        assertDoesNotThrow(() -> colorCorrection.adjustColors("test.jpg"), "Color correction should not throw exceptions");
    }

    @Test
    void testImageResizer() {
        ImageResizer imageResizer = new BasicImageResizer();
        assertDoesNotThrow(() -> imageResizer.resize("test.jpg", 800, 600), "Image resizing should not throw exceptions");
    }

    @Test
    void testFullImageProcessing() {
        ColorCorrection colorCorrection = new BasicColorCorrection();
        ImageResizer imageResizer = new BasicImageResizer();
        ImageProcessor processor = new ImageProcessor(colorCorrection, imageResizer);

        assertDoesNotThrow(() -> processor.processImage("test.jpg", new BlackAndWhiteFilterFactory(), 800, 600), "Full image processing should not throw exceptions");
    }
}