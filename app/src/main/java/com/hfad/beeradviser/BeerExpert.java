package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidg on 28/04/2017.
 */

public class BeerExpert {

    List<String> brandList = new ArrayList<>();

    String getBrands(String color) {
        //Build the brand recommendation List
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
                throw new IllegalStateException("Unexpected value: " + color);
        }
        //Create a simple string from the List
        String brands = "";
        for(String brand : brandList) brands += brand + " \n";
        return brands;
    }
}
