package sena;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author Sergej Chumakov on 24.11.2023
 */
@Getter
@Setter
public class ExchangeRateForDate implements PrettyJson {

    private String date;            //"01.12.2014"
    private String bank;            //"PB"
    private int baseCurrency;       //980
    private String baseCurrencyLit; //"UAH"

    private List<Currency> exchangeRate;

    @Override
    public String toString() {
        return prettyJson(this);
    }
}
