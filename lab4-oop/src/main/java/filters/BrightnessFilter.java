package filters;

public class BrightnessFilter implements ImageFilter {
    @Override
    public void applyFilter(String imagePath) {
        System.out.println("Applying Brightness filter to " + imagePath);
    }
}