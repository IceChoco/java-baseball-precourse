package study;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassTest {
    @Test
    void chkIsInterface(){
        assertThat(Runnable.class).isInterface();
    }

    @Test
    void IsAssignableFrom(){
        //assertThat(A.class).isAssignableFrom(B.class);
        assertThat(Exception.class).isAssignableFrom(NoSuchElementException.class);
    }
}
