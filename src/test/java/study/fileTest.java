package study;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class fileTest {
    @Test
    void chkFile(){
        File file = new File("C:\\github\\java-baseball-precourse\\src\\main\\java\\study\\Dog.java");
        assertThat(file)
                .exists()
                .isFile()
                .canRead()
                .canWrite();
    }
}
