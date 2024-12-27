package processors;

import filters.BrightnessFilter;
import org.processing.ImageProcessor;

public class BrightnessProcessor extends Processor {
    @Override
    public ImageProcessor createProcessor() {
        return new ImageProcessor(new BrightnessFilter());
    }
}