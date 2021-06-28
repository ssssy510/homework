package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<Beer> getBrands(String color) {
        List<Beer> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add(new Beer("Jack Amber",1999));
            brands.add(new Beer("Red Moose",1988));
        } else {
            brands.add(new Beer("Jali Pale Ale",1977));
            brands.add(new Beer("Gout Stout",1966));
        }
        return brands;
    }
}
