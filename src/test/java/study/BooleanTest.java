package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BooleanTest {
    @Test
    void isTrue(){
        assertThat("".isEmpty()).isTrue();
    }
}
