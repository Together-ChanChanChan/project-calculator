package together.chanchanchan.calculator;

public class Calculator {
    public int multiplication(int num1, int num2) {
        int answer = num1 * num2;

        if (answer > 99999999) {
            answer = 99999999;
            System.out.println("출력될 수 있는 값의 허용 범위를 초과하였습니다.");
        } else {
            System.out.println(num1 + " * " + num2 + " = " + answer);
        }
        return answer;
    }
}
