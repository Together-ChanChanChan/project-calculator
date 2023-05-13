package together.chanchanchan.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @DisplayName("두 수를 곱했을 때 99999999가 넘으면 오류 출력하기")
    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();

        calculator.multiplication(55555555, 2);
    }
}
