package array;

public class BookArray {
    public static void main(String[] args) {

        Book[] libray = new Book[5];

        for(int i = 0; i<libray.length; i ++) {
            System.out.println(libray[i]);
        }
        libray[0] = new Book("누가 내 치즈를 먹었을까?", "생텍쥐베리"); //인스턴스 생성
        libray[1] = new Book("누가 내 치즈를 먹었을까1?", "생텍쥐베리1");
        libray[2] = new Book("누가 내 치즈를 먹었을까2?", "생텍쥐베리2");
        libray[3] = new Book("누가 내 치즈를 먹었을까3?", "생텍쥐베리3");
        libray[4] = new Book("누가 내 치즈를 먹었을까4?", "생텍쥐베리4");

                for(int i = 0; i<libray.length; i++) {
                    System.out.println(libray[i]);
                }

                for(int i = 0; i< libray.length; i++) {
                    libray[i].showBookInfo();
                }
    }
}
