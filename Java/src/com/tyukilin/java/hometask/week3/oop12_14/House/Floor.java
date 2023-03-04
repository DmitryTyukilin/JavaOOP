package com.tyukilin.java.hometask.week3.oop12_14.House;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public Number getNumber() {
        return this.number;
    }

    public Apartment[] getApartments() {
        return this.apartments;
    }

    public void printInfo() {
        System.out.println("Этаж №: " + getNumber() + " количество квартир " + getApartments().length);
    }
}
