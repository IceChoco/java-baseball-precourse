package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class NumberTest {
    private static Number number;

    @BeforeEach
    @DisplayName("Number 객체 생성")
    void beforeTest(){
        number = new Number();
    }

    @Test
    @DisplayName("랜덤 생성 숫자 검증")
    void verifiying_random_generated_number(){
        number.setRandomNumber();
        assertThat(chkValid()).isTrue();
    }

    boolean chkValid(){
        String numStr = Arrays.toString(number.getNum()).replaceAll("[^0-9]","");
        System.out.println(numStr);
        return number.callValidUserInput(numStr);
    }

    @Test
    @DisplayName("정상 입력 케이스")
    void normalInput(){
        number.setUserInput("123");
        assertThat(chkValid()).isTrue();
    }

    @Test
    @DisplayName("자릿수를 오버해서 입력한 경우")
    void longInput(){
        number.setUserInput("123456");
        assertThatIllegalArgumentException().isThrownBy(this::chkValid);
    }

    @Test
    @DisplayName("자릿수를 짧게 입력한 경우")
    void shortInput(){
        number.setUserInput("12");
        assertThatIllegalArgumentException().isThrownBy(this::chkValid);
    }

    @Test
    @DisplayName("1부터 9까지의 숫자가 아닌 경우")
    void wrongRangeInput(){
        number.setUserInput("120");
        assertThatIllegalArgumentException().isThrownBy(this::chkValid);
    }

    @Test
    @DisplayName("각 자리 숫자가 유니크하지 않은 경우")
    void notUniqueInput(){
        number.setUserInput("999");
        assertThatIllegalArgumentException().isThrownBy(this::chkValid);
    }

    @Test
    @DisplayName("각 자리 숫자가 유니크하지 않은 경우2")
    void notUniqueInput2(){
        number.setUserInput("991");
        assertThatIllegalArgumentException().isThrownBy(this::chkValid);
    }

}
