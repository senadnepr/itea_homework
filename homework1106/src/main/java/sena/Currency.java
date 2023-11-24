package sena;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sergej Chumakov on 24.11.2023
 */
@Getter
@Setter
public class Currency implements PrettyJson {

    private String baseCurrency;    // "UAH"
    private String currency;        //"CAD"
    private double saleRateNB;      //13.21074
    private double purchaseRateNB;  //13.21074
    private double saleRate;        //15
    private double purchaseRate;    //13

    @Override
    public String toString() {
        return prettyJson(this);
    }
}
