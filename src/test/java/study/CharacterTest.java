package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CharacterTest {
    @Test
    void characterTest(){
        char someCharacter = 'b';
        assertThat(someCharacter)
                .isNotEqualTo('a')
                .inUnicode()
                .isGreaterThanOrEqualTo('b')
                .isLowerCase();
    }
}
