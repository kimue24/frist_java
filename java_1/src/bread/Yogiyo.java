package bread;

public class Yogiyo {

    double chargeRatio =  0.05;
    int charge;

    public int Sellbread (int sellMoney){

        charge += sellMoney * chargeRatio;
        System.out.println("요기요가 "+charge+" 수수료를 획득 하였습니다.");
        return charge;
    }
}
