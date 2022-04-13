package study;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class InputStreamTest {
    @Test
    void testHasSomeContentAs(){
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        InputStream given = new ByteArrayInputStream(bytes);

        byte[] oneBytes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        InputStream result = new ByteArrayInputStream(oneBytes);

        assertThat(given).hasSameContentAs(result);
    }
}
