package sena;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

/**
 * @author Sergej Chumakov on 21.11.2023
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        ExchangeRateForDate exchangeRateForDate = objectMapper
                .readValue(new URL(
                        "https://api.privatbank.ua/p24api/exchange_rates?date=01.12.2014"),
                        ExchangeRateForDate.class);
        System.out.println(exchangeRateForDate.toString());
    }
}
