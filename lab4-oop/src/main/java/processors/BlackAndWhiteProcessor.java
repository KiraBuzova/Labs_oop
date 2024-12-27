package processors;

import filters.BlackAndWhiteFilter;
import org.processing.ImageProcessor;

public class BlackAndWhiteProcessor extends Processor {
    @Override
    public ImageProcessor createProcessor() {
        return new ImageProcessor(new BlackAndWhiteFilter());
    }
}