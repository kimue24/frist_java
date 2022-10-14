package array20221014;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5]; //책을 가르킬 주소의 자리가 5개 만들어진다.
		
		for(int i =0; i<library.length; i++) {
			System.out.println(library[i]); //null
		}
		
		library[0] = new Book("태백산맥1", "조정래1");
		library[1] = new Book("태백산맥2", "조정래2");
		library[2] = new Book("태백산맥3", "조정래3");
		library[3] = new Book("태백산맥4", "조정래4");
		library[4] = new Book("태백산맥5", "조정래5");
		
		for(int i = 0; i<library.length; i ++) {
			System.out.println(library[i]); // library에 주소값 출력
		}
		for(int i = 0; i<library.length; i ++) {
			library[i].showBookInfo(); // library의 객체 출력
		}
	}
}
