package package1;

import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {

		
		int [] num = new int[10];
		char [] op = new char[9];
		int total = 0;
		
		for(int i = 0; i<num.length; i ++) {
			System.out.println("연산을 수행합니다.");
			Scanner in = new Scanner(System.in);
			num[i] = in.nextInt();
			System.out.println("num의 인덱스는" + i + "안에 값은" + num[i]);
		}
		System.out.println("연산을 수행");
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(num[0]);
		total += num[0];
		for(int j=1; j<num.length; j++ ) {
			if(num[j] % 2 == 0) {
				total += num[j];
				op[j-1] = '+';
			}else {
				total *=num[j];
				op[j-1] = '*';
				
			}
			buffer.append(op[j-1]);
			buffer.append(num[j]);
		}
		System.out.println(buffer);
	}

	
}
