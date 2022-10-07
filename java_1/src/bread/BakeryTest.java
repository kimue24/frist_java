package bread;

public class BakeryTest {
    public static void main(String[] args) {
        Bakery bakeryP = new Bakery("Paris", 50);
        Yogiyo yogiyo = new Yogiyo();
        Delivery delivery = new Delivery();

        //요기요 빵 30개 주문
        bakeryP.YogiyoSellBread(yogiyo, 30);
        bakeryP.showInfo();
        //배달의민족 빵 10개 주문
        bakeryP.DeliverySellBread(delivery,10);
        bakeryP.showInfo();
    }
}
