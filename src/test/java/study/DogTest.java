package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DogTest {
    Dog fido       = new Dog("Fido", (float) 5.25);
    Dog fidosClone = new Dog("Fido", (float) 5.25);

    @Test
    void isEqualTo(){
        assertThat(fido).isEqualTo(fidosClone);
    }

    @Test
    void isEqualToComparingFieldByFieldRecursively(){
        assertThat(fido).isEqualToComparingFieldByFieldRecursively(fidosClone);
    }
}
