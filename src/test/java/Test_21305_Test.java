import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class Test_21305_Test {

    @Test
    public void test() {
        assertThat(Test_21305.translateRomanToDecimal("MCMLXXXIV")).isEqualTo(1984);
        assertThat(Test_21305.translateRomanToDecimal("MMMCMXCIX")).isEqualTo(3999);
    }
}
