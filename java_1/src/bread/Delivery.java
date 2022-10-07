package bread;

public class Delivery {

    double chargeRatio = 0.1;
    int charge;
    int sellMoney;

    public int Sellbread (int sellMoney) {

        charge += (int)sellMoney * chargeRatio;

        System.out.println("배달의민족이" + charge + "수수료를 획득 하였습니다.");
        return charge;
    }
}
