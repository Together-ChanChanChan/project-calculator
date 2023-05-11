package together.chanchanchan.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @DisplayName("뺄셈 테스트")
    @Test
    public void testSub() {
        Calculator calculator = new Calculator();

        calculator.sub(100, 50);
    }

    @DisplayName("출력 범위 초과 테스트")
    @Test
    public void testMax() {
        Calculator calculator = new Calculator();

        calculator.sub(200000000, 1);
    }
}
