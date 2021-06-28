package com.swufe.javaee.beerV1.model;

public class Beer {
    private String brand;
    private int year_of_birth;

    public Beer(String a, int b) {
        brand = a;
        year_of_birth = b;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public void showInfo() {
        System.out.printf("Brand:%s\nYear of birth:%d\nCountry:%s", brand, year_of_birth);
    }

    public String toString(){
        return "Brand:"+brand+"Year of birth:"+year_of_birth;
    }

}
