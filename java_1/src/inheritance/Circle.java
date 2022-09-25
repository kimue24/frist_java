package inheritance;

public class Circle {

    Point point; // 상속이 아닌 그냥 쓰고싶을때는 이렇게 하면 됨.(합성)

    private int radius;

    public Circle() {
        point = new Point();
    }
}
