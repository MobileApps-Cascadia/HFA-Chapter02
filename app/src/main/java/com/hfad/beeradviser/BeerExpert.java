package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    //TODO: Complete the Model with private members, a constructor, and getter/setter methods
    private String color;

    public BeerExpert() {
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    String getRecommendation(String color) {
        //Adds brand recommendation data to an ArrayList
        List<String> brandList = new ArrayList<>();
        switch (color) {
            case "light":
                brandList.add("Jail Pale Ale");
                brandList.add("Gout Stout");
                break;
            case "amber":
                brandList.add("Jack Amber");
                brandList.add("Red Moose");
                break;
            case "brown":
                brandList.add("Undercover Ale");
                break;
            case "dark":
                brandList.add("Peanut butter Stout");
                brandList.add("Guinness");
                break;
            default:
                brandList.add("No brands available");
        }
        //Create a simple string from the ArrayList
        String brands = "";
        for(String brand : brandList) brands += brand + " \n";
        return brands;
    }
}
