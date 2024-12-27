package org.processing;

import org.junit.jupiter.api.Test;
import processors.BlackAndWhiteProcessor;
import processors.BlurProcessor;
import processors.BrightnessProcessor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ImageProcessingExtendedTests {
    @Test
    void testColorCorrection() {
        ColorCorrection colorCorrection = new BasicColorCorrection();
        assertDoesNotThrow(() -> colorCorrection.adjustColors("test.jpg"),
                "Color correction should not throw exceptions");
    }

    @Test
    void testImageResizer() {
        ImageResizer imageResizer = new BasicImageResizer();
        assertDoesNotThrow(() -> imageResizer.resize("test.jpg", 800, 600),
                "Image resizing should not throw exceptions");
    }

    @Test
    void testFullImageProcessing() {
        String imagePath = "test.jpg";

        assertDoesNotThrow(() -> {
            new BlackAndWhiteProcessor().createProcessor().processImage(imagePath);
            new BlurProcessor().createProcessor().processImage(imagePath);
            new BrightnessProcessor().createProcessor().processImage(imagePath);
        }, "Full image processing for all processors should not throw exceptions");
    }
}
