package calculator.lv1;

import java.util.Scanner;

// Lv 1. 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { //계산 결과가 나온 다음 exit를 입력하기 전까지 무한루프
            int num1 = -1;
            while (num1 < 0) { //양의 정수(0 포함)가 아닌 수를 입력하면 다시 입력하도록 한다.
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt(); // 양의 정수(0 포함) 첫 번째 숫자를 입력받는다.
                if (num1 < 0) {
                    System.out.println("양의 정수(0 포함) 을 입력해주세요.");
                }
            }

            int num2 = -1;
            while (num2 < 0) { //양의 정수(0 포함)가 아닌 수를 입력하면 다시 입력하도록 한다.
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt(); // 양의 정수(0 포함) 두 번째 숫자를 입력받는다.
                if (num2 < 0) {
                    System.out.println("양의 정수(0 포함) 을 입력해주세요.");
                }
            }

            char operator = ' ';
            boolean validOperator = false;
            while (!validOperator) { //잘못된 기호를 입력하면 다시 입력하도록 한다.
                System.out.print("사칙연산 기호를 입력하세요(+, -, *, /) : ");
                operator = sc.next().charAt(0); // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    validOperator = true;
                } else {
                    System.out.println("잘못된 기호를 입력했습니다. + - * / 중에 입력해주세요.");
                }
            }

            int result = 0;
            if (operator == '+') { //입력된 두 수와 연산 기호로 실제 연산 수행
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = 0;
                    continue; //다음 루프로 바로 넘어간다.
                } else {
                    result = num1 / num2;
                }
            } //결과값을 result에 복사

            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            } // "exit" 이라고 입력하면 즉시 프로그램 종료, 그 외 입력하면 다시 처음으로 돌아간다.

        }
        sc.close();
    }
}
