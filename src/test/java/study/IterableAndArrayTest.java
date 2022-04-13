package study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IterableAndArrayTest {
    @Test
    void arrayContain() {
        List<String> list = Arrays.asList("1","2","3");
        assertThat(list).contains("1");
    }

    @Test
    void arrayIsNotEmpty() {
        List<String> list = Arrays.asList("1","2","3");
        assertThat(list).isNotEmpty();
    }

    @Test
    void arrayStartsWith() {
        List<String> list = Arrays.asList("1","2","3");
        assertThat(list).startsWith("1");
    }

    @Test
    void arrayTotalCheck() {
        List<String> list = Arrays.asList("1","2","3");
        assertThat(list).isNotEmpty().contains("1").doesNotContainNull().containsSequence("1","2");
        //containsSequence("1","2"): 원소 "2", "3"을 순서대로 포함하는지
    }
}
