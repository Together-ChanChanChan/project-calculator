package together.chanchanchan.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import together.chanchanchan.Caculator.Calculator;

public class CalculatorTest {
    @DisplayName("더하기 프로그램 테스트")
    @Test
    public void plusTest() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.plus(1, 2) , 3);
    }

    @DisplayName("최대 범위 테스트")
    @Test
    public void rangeTest() {
        Calculator calculator = new Calculator();
        calculator.plus(99999999,1);
    }
}
