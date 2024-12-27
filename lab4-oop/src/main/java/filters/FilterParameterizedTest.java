package filters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.stream.Stream;

class FilterParameterizedTest {
    static Stream<ImageFilter> filterProvider() {
        return Stream.of(
                new BlackAndWhiteFilter(),
                new BlurFilter(),
                new BrightnessFilter()
        );
    }

    @ParameterizedTest
    @MethodSource("filterProvider")
    void testFilters(ImageFilter filter) {
        assertDoesNotThrow(() -> filter.applyFilter("test.jpg"),
                "Filter application should not throw exceptions");
    }
}
