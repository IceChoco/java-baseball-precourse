package exam;

import exam.utils.VlidationUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {
    @Test
    @DisplayName("야구 숫자 1부터 9까지 검증")
    void Baseball_Number_1_9_Verification() {
        assertThat(VlidationUtils.validNo(9)).isTrue();
        assertThat(VlidationUtils.validNo(1)).isTrue();
        assertThat(VlidationUtils.validNo(0)).isFalse();
        assertThat(VlidationUtils.validNo(10)).isFalse();
    }
}
