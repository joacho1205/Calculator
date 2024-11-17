package calculator.lv2;

public class Calculator {
    public static int operate(int i, int j, char operater) {


        int result = 0;
        if (operate == '+') {
            result = i + j;
        } else if (operate == '-') {
            result = i - j;
        } else if (operate == '*') {
            result = i * j;
        } else if (operate == '/') {
            if (j == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = i / j;
            }
        } else {
            System.out.println("잘못된 기호를 입력했습니다. + - * / 중에 입력해주세요.");
        }



    }
}
