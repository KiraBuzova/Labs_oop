package org.processing;

public class BasicColorCorrection implements ColorCorrection {
    @Override
    public void adjustColors(String imagePath) {
        System.out.println("Adjusting colors for " + imagePath);
    }
}
