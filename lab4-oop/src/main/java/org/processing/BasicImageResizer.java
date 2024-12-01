package org.processing;

public class BasicImageResizer implements ImageResizer {
    @Override
    public void resize(String imagePath, int width, int height) {
        System.out.println("Resizing " + imagePath + " to " + width + "x" + height);
    }
}
