package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberTest {
    private static final int START_NUM = 1;
    private static final int END_NUM = 9;
    private static final int MAX_SIZE = 3;

    @Test
    @DisplayName("랜덤 생성 숫자 검증")
    void verifiying_random_generated_number(){
        Number computerNum = new Number();
        computerNum.setRandomNumber();
        int[] computer = computerNum.getNum();

        chkLength(computer);
        chkRange(computer);
        chkUnique(computer);
    }

    @DisplayName("MAX_SIZE자리 자연수인지 확인")
    void chkLength(int[] computer){
        assertThat(computer).hasSize(MAX_SIZE);
    }

    @DisplayName("START_NUM부터 END_NUM까지의 숫자인지 확인")
    void chkRange(int[] computer){
        for(int c:computer){
            assertThat(c).isBetween(START_NUM,END_NUM);
        }
    }

    @DisplayName("각 숫자가 unique한지 확인")
    void chkUnique(int[] computer){
        assertThat(computer).doesNotHaveDuplicates();
    }
}
