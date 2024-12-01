package filters;

public class BlurFilterFactory extends FilterFactory {
    @Override
    public ImageFilter createFilter() {
        return new BlurFilter();
    }
}