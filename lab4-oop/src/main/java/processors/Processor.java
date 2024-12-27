package processors;

import org.processing.ImageProcessor;

public abstract class Processor {
    public abstract ImageProcessor createProcessor();
}