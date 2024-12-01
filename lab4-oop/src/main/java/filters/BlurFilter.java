package filters;

public class BlurFilter implements ImageFilter {
    @Override
    public void applyFilter(String imagePath) {
        System.out.println("Applying Blur filter to " + imagePath);
    }
}