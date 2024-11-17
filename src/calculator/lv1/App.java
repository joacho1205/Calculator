package calculator.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int i = sc.nextInt(); // 첫 번째 숫자를 입력받는다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int j = sc.nextInt(); // 두 번째 숫자를 입력받는다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operate = sc.next().charAt(0);
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

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

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }

        }
    }
}