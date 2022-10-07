package array;

public class ArrayTest {

	public static void main(String[] args) {

		/* 배열의 기본형태
		 * int [] numbers = new int [10];
		 */
		
		// 배열 초기화 하는방법.
		
		int [] numbers = new int[] {0,1,2};
		
		//new int[] 는 안써도 된다. 그러나 이렇게 보통 많이 쓴다.
		
		System.out.println(numbers.length); //3
		
		//각각 초기화해서 넣는빙밥
		
		int[] numbers2 = new int[3];
		
		numbers2[0] = 1;
		numbers2[1] = 2;
		numbers2[2] = 3;
		for(int i = 0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("======아무런 초기화값 없이 선언만 한 경우에 초기값======");
		
		String[] studentIDs = new String[5];

		for(int i = 0; i<studentIDs.length; i++) {
			System.out.println(studentIDs[i]);
		}

	}

}
