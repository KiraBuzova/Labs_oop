package org.processing;

import filters.BlackAndWhiteFilterFactory;
import filters.BlurFilterFactory;
import filters.BrightnessFilterFactory;

public class ImageProcessingApp {
    public static void main(String[] args) {
        ColorCorrection colorCorrection = new BasicColorCorrection();
        ImageResizer imageResizer = new BasicImageResizer();
        ImageProcessor processor = new ImageProcessor(colorCorrection, imageResizer);

        String imagePath = "example.jpg";

        processor.processImage(imagePath, new BlackAndWhiteFilterFactory(), 800, 600);
        processor.processImage(imagePath, new BlurFilterFactory(), 1024, 768);
        processor.processImage(imagePath, new BrightnessFilterFactory(), 1280, 720);
    }
}
