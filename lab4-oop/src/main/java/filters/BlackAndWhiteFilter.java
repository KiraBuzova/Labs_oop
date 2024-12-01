package filters;

public class BlackAndWhiteFilter implements ImageFilter {
    @Override
    public void applyFilter(String imagePath) {
        System.out.println("Applying Black and White filter to " + imagePath);
    }
}