package com.gly.design.behavior.command;

import com.sun.org.apache.xpath.internal.operations.Or;

public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
