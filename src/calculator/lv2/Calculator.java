package calculator.lv2;

public class Calculator {
    private static int result;

    public static int operate(int num1, int num2, char operator) {
        int result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("잘못된 기호를 입력했습니다. + - * / 중에 입력해주세요.");
        }

        return result;
    }

    public static int getResult() {
        return result;
    }

    public void setResult(int result) {

    }

}
