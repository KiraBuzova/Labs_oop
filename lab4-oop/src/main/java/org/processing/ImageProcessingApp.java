package org.processing;

import processors.BlackAndWhiteProcessor;
import processors.BlurProcessor;
import processors.BrightnessProcessor;
import processors.Processor;

public class ImageProcessingApp {
    public static void main(String[] args) {
        String imagePath = "example.jpg";

        Processor[] factories = {
                new BlackAndWhiteProcessor(),
                new BlurProcessor(),
                new BrightnessProcessor()
        };

        for (Processor factory : factories) {
            ImageProcessor processor = factory.createProcessor();
            processor.processImage(imagePath);
        }
    }
}
