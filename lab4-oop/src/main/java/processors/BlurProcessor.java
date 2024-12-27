package processors;

import filters.BlurFilter;
import org.processing.ImageProcessor;

public class BlurProcessor extends Processor {
    @Override
    public ImageProcessor createProcessor() {
        return new ImageProcessor(new BlurFilter());
    }
}