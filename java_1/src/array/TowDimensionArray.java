package array;

public class TowDimensionArray {
    public static void main(String[] args) {

        //int [] [] arr = new int[2][3]; 결과값 같음
        int [] [] arr ={{1,2,3,},{4,5,6}};
        System.out.println(arr.length); //2
        System.out.println(arr[0].length); //3
        System.out.println(arr[1].length); //3

        System.out.println("===================");

        for(int i = 0; i< arr.length; i++) {
            for(int j = 0; j<arr[i].length; j ++) {
                System.out.println(arr[i][j]);
            }
        }

        char[][] alphabets = new char[13][2]; // 형이랑 같이해보기 알파벳 'A'~'Z'출력해보기

    }
}


