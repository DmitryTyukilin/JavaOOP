package com.tyukilin.java.hometask.week3.oop12_14.House;

public class House {
    private int number;
    private Floor[] floor;

    public House(int number, Floor[] floor) {
        this.number = number;
        this.floor = floor;
    }

    public Number getNumber() {
        return this.number;
    }

    public Floor[] getFloor() {
        return this.floor;
    }

    public void printInfo() {
        System.out.println("Дом №: " + getNumber() + " количество этажей " + getFloor().length);
    }
}

