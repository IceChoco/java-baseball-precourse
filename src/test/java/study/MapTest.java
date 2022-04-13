package study;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.MapEntry.entry;

public class MapTest {
    @Test
    void chkMap(){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2,"a");
//        map.put(10,"b");

        assertThat(map).isNotEmpty()
                .containsKey(2)
                .doesNotContainKey(10)
                .contains(entry(2,"a"));
    }
}
