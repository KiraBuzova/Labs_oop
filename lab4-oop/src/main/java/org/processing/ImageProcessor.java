package org.processing;

import filters.FilterFactory;

public class ImageProcessor {
    private final ColorCorrection colorCorrection;
    private final ImageResizer imageResizer;

    public ImageProcessor(ColorCorrection colorCorrection, ImageResizer imageResizer) {
        this.colorCorrection = colorCorrection;
        this.imageResizer = imageResizer;
    }

    public void processImage(String imagePath, FilterFactory filterFactory, int newWidth, int newHeight) {
        System.out.println("Starting image processing for: " + imagePath);
        imageResizer.resize(imagePath, newWidth, newHeight);
        colorCorrection.adjustColors(imagePath);
        filterFactory.createFilter().applyFilter(imagePath);
        System.out.println("Image processing completed for: " + imagePath);
    }
}
