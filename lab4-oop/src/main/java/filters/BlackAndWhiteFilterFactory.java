package filters;

public class BlackAndWhiteFilterFactory extends FilterFactory {
    @Override
    public ImageFilter createFilter() {
        return new BlackAndWhiteFilter();
    }
}