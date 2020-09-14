package com.gly.design.factory.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.prepareVegMeal();
        meal1.showItems();
        System.out.println("VegMeal Cost:"+meal1.getCost());

        Meal meal2 = mealBuilder.prepareNonVegMeal();
        meal2.showItems();
        System.out.println("NonVegMeal Cost:"+meal2.getCost());
    }
}
