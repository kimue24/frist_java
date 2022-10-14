package array;

public class ArrayTesst2 {

	public static void main(String[] args) {

		//배열은 자료가 있는 요소만 출력하려면 그 크기를 따로저장해야한다. **
		
		double[] num = new double[5];
		
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;
		
		for(int i = 0; i<size; i ++) {
			System.out.println(num[i]);
			total *=num[i];
		}
		System.out.println("total" + total);
	}

}
