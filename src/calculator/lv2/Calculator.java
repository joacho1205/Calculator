package calculator.lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Integer> resultsQueue; //연산 결과를 저장하는 큐

    public Calculator() {
        resultsQueue = new LinkedList<>();
    }

    public int operate(int num1, int num2, char operator) {
        int result = 0;
        if (operator == '+') { //연산 수행
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return Integer.MIN_VALUE;
            } else {
                result = num1 / num2;
            }
        }

        resultsQueue.add(result); //큐에 결과 저장
        return result;
    }

    public int getResult() {
        if (resultsQueue.isEmpty()) {
            return 0; // 큐가 비어 있으면 0 반환
        } else {
            return resultsQueue.peek(); // 큐에 데이터가 있으면 가장 앞의 요소 반환
        }
    }

    public void removeResult() {
        if (!resultsQueue.isEmpty()) {
            int removeResult = resultsQueue.poll(); // 가장 먼저 저장된 결과 삭제
            System.out.println("삭제된 결과: " + removeResult);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}
