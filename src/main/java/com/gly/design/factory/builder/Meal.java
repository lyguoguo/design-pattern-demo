package com.gly.design.factory.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    public List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public Double getCost(){
        Double price = items.stream().mapToDouble(Item::price).sum();
        return price;
    }

    public void showItems(){
        items.forEach(item->{
            System.out.println("name: "+item.name());
            System.out.println(",packing: "+item.packing().pack());
            System.out.println(",price: "+item.price());
        });
    }


}
