package together.chanchanchan.Caculator;

import java.util.Scanner;

public class Calculator {
    public int plus(int num1, int num2) {
        int result = 0;
        if ((num1 + num2) < 99999999) {
            result = num1 + num2;
        } else {
            System.out.println("최대 결과값을 초과하셨습니다.");
            return 0;
        }
        return result;
    }
}
