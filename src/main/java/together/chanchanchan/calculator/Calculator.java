package together.chanchanchan.calculator;

public class Calculator {

    public int sub(int num1, int num2) {
        int result = num1 - num2;

        if(result > 99999999) {
            System.out.println("출력 범위를 벗어났습니다.");
            return 0;
        }

        System.out.print("계산 결과 : " + result);
        return result;
    }
}
