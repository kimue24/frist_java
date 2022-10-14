package package1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class discount_coupon {

	public static void main(String[] args) {

		System.out.println("제품 가격을 입력해주십시오");

		int[] price = new int[10];
		
		while(true) {
		try{
		for (int i = 0; i < price.length; i++) {
			System.out.println("금액입력 [최대:10개]");
			Scanner in = new Scanner(System.in);
			price[i] = in.nextInt();
		}

		int total = 0;
		int discountMax = price[0];
		int discountmin = price[0];
		Arrays.sort(price);
		total += price[0];
		
		for (int j = 1; j < price.length; j++) {
			discountMax = (int) (price[price.length - 1] * 0.10);
			discountmin = (int) (price[0] * 0.50);
			total += price[j];
		} 
		int discounttotal = (int) discountMax + discountmin;
		int resulttotal = total - discounttotal;
		
		System.out.println("가장 작은 금액의 할인금액은 " + discountmin + "입니다");
		System.out.println("가장 큰 금액의 할인금액은 " + discountMax + "입니다");
		System.out.println("제품 전체의 가격은" + total +"입니다.");
		System.out.println("할인쿠폰을 적용하여" + discounttotal +"할인 되었습니다.");
		System.out.println("지불할 금액은" + resulttotal +"입니다.");
		
		}catch (InputMismatchException e) {
			System.out.println("잘못된 값을 입력하셨습니다.");
			throw e; // 이걸 쓰고 안쓰고에 따라 에러가 출력 되고 안되고를 알 수있음.
			}
		}
	}
}

