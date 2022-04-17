package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogTest {
    Dog fido       = new Dog("Fido", (float) 5.25);
    Dog fidosClone = new Dog("Fido", (float) 5.25);

    @Test
    void isEqualTo(){
        assertThat(fido).isNotEqualTo(fidosClone);
    }

    @Test
    void isEqualToComparingFieldByFieldRecursively(){
        assertThat(fido).usingRecursiveComparison()
                        .isEqualTo(fidosClone);

        //AssertJ 3.12.0 버전 이전 사용 방식
        //.isEqualToComparingFieldByFieldRecursively(fidosClone);
    }
}
