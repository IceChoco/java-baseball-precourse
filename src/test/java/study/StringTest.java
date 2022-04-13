package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split(){
        String str1 = "1,2";
        String str2 = "1";

        String[] strArray1 = str1.split(",");
        String[] strArray2 = str2.split(",");

        //"1,2"를 ,로 split 했을 때 1과 2로 잘 분리되는지 확인
        assertThat(strArray1).contains("1","2");//순서와 상관 없이 실제 그룹이 주어진 값들을 포함하고 있는지를 테스트

        //"1"을 ,로 split 했을 때 "1만을" 포함하는 배열이 반환되는지 확인
        assertThat(strArray1).containsExactly("1");//순서까지 고려해서 실제 그룹이 주어진 값들을 포함하고 있는지를 테스트
    }

    @Test
    void subString(){
        String str1 = "(1,2)";
        String result = str1.substring(1,4);
        System.out.println(result);

        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("특정 위치의 문자를 가져온다.")
    void charAt(){
        String str = "abc";
        int idx = 2;
        str.charAt(idx);
    }

    @Test
    @DisplayName("charAt - assertThatThrownBy()를 사용하여 Exception 처리")
    void chatAtException(){
        String str = "abc";
        int idx = 3;

        assertThatThrownBy(()->{
           char c = str.charAt(idx);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("%d", idx);
    }

    @Test
    @DisplayName("charAt - assertThatExceptionOfType()를 사용하여 Exception 처리")
    void chatAtException2(){
        String str = "abc";
        int idx = 3;

        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    char c = str.charAt(idx);
                }).withMessageContaining("%d", idx);
    }

}
