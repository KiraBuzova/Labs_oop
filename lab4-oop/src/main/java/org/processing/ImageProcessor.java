package org.processing;

import filters.ImageFilter;

public class ImageProcessor {
    private final ImageFilter filter;

    public ImageProcessor(ImageFilter filter) {
        this.filter = filter;
    }

    public void processImage(String imagePath) {
        System.out.println("Starting image processing: " + imagePath);
        filter.applyFilter(imagePath);
        System.out.println("Image processing completed: " + imagePath);
    }
}
