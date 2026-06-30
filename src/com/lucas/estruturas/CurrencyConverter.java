package com.lucas.estruturas;

import java.util.Locale;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice){
        return (dollarPrice * amount) * (1.0 + IOF);
    }

}
