package com.bwielk.testngspring.testngspring.constants;

public enum Currencies {

    EURO("€");

    private String symbol;

    Currencies(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
