package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ResultTest {

    @Test()
    @DisplayName("스트라이크, 볼, 낫싱 출력 확인")
    void test(){
        int[] computer = {7,1,3};
        int[] player = {1,2,3};

        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Result result = new Result();
        result.chkAnswer(computer,player);

        String expected = "1볼 1스트라이크\n";
        assertThat(expected).isEqualTo(out.toString().replace("\r", ""));
    }
}
