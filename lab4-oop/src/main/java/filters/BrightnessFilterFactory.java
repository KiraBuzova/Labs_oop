package filters;

public class BrightnessFilterFactory extends FilterFactory {
    @Override
    public ImageFilter createFilter() {
        return new BrightnessFilter();
    }
}