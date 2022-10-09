package bread;

public class Bakery {

    String bakeryName;
    int breadCount;
    int charge ;
    int money ;
    int breadPrice = 1000;

    public Bakery (String bakeryName, int breadCount){
        this.bakeryName = bakeryName;
        this.breadCount = breadCount;

    }

    public void YogiyoSellBread (Yogiyo yogiyo, int breadCount){
        System.out.println("요기요 주문으로 빵 "+breadCount+"개 주문이 들어왔습니다.");
        int sellMoney = breadCount * breadPrice;
        int charge = yogiyo.Sellbread(sellMoney);
        this.charge += charge;
        this.breadCount -= breadCount;
        sellMoney -= charge;
        money += sellMoney;

        System.out.println("이번주문의 빵판매 금액 : "+ money+" 수수료:"+charge+" 남은 빵의개수는:"+this.breadCount);

    }

    public void DeliverySellBread (Delivery delivery, int breadCount){
        System.out.println("배달의민족 주문으로 빵 "+breadCount+"개 주문이 들어왔습니다.");
        int sellMoney = breadCount * breadPrice;
        int charge = delivery.Sellbread(sellMoney);
        this.charge += charge;
        this.breadCount -= breadCount;
        sellMoney -= charge;
        money += sellMoney;

        System.out.println("이번주문의 빵판매 금액 : "+ sellMoney+" 수수료:"+charge+" 남은 빵의개수는:"+this.breadCount);
    }
    public void showInfo (){
        System.out.println("총 빵 판매금액: "+ money + "원 총 수수료액: "+charge+ "원");
    }

}
