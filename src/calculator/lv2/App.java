package calculator.lv2;

import java.util.Scanner;

// Lv 2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
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

            int result = calculator.operate(num1, num2, operator);
            if (result == Integer.MIN_VALUE) {
                // 오류가 발생했을 경우, 루프 처음으로 돌아감
                continue;
            }
            System.out.println("결과: " + calculator.getResult());

            System.out.println("삭제 기능을 실행하시겠습니까? (yes/no)");
            String deleteOption = sc.next();
            if (deleteOption.equalsIgnoreCase("yes")) {
                calculator.removeResult();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }

        }
        sc.close();
    }
}