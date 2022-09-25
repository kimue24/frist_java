package array;

public class ArrayTest3 {
    public static void main(String[] args) {
        //알파벳 a부터 z까지 배열에 넣어라
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i = 0; i<alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }
        for(int i = 0; i<alphabets.length; i++, ch++) { //이부분 잘 이해안감.
            System.out.println(alphabets[i]);
        }
    }
}
