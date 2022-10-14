package package1;

import java.util.Scanner;

public class evenOddOperator {

    public static void main(String[] args) {

        int number[] = new int[10];
        char operator[] = new char[9];
        String numberOperator;
        int total;

        for (int i = 0; i == 0; ) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("입력된 숫자가 짝수면 덧셈을, 홀수면 곱셈을 수행 합니다.");
            System.out.println("연산을 수행할 숫자를 입력해주세요. \n");
            for (int j = 0; j < number.length; j++) {
                number[j] = scanner.nextInt();
                System.out.println("number[" + j + "] 값 : " + number[j] + "입니다.");
            }
            break;
        }
        System.out.println("연산을 수행합니다.");

        StringBuffer buffer = new StringBuffer();
        buffer.append(number[0]);
        total = number[0];
        for (int i = 1; i < number.length; i++){
            if (number[i] % 2 == 1) {
                operator [i-1] = '*';
            }else {
                operator[i-1] = '+';
            }
            buffer.append(operator[i-1]);
            buffer.append(number[i]);

            if (operator [i-1] == '*'){
                total *= number[i];
            }else {
                total += number[i];
            }

        }
        numberOperator = buffer.toString();
        System.out.println("수행할 연산: "+buffer);
        System.out.println("결과값: "+total);
    }
}
