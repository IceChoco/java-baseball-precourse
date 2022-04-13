package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class NumericTest {
    @Test
    void chkNumeric(){
        //몇 자리 갭을 허용할거냐로 해석하는게 맞을 듯 0.123 이랑 0.124 같게 보려면 precision에 0.001 줘야함
        assertThat(5.123).isEqualTo(5.124, withPrecision(0.001d));//같음
        //assertThat(5.123).isEqualTo(5.124, withPrecision(0.0001d));//다름
        //assertThat(6.1).isEqualTo(5, withPrecision(1d));//다름
    }
}
