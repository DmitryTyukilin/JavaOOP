package com.tyukilin.java.hometask.week3.oop12_14.House;

public class Apartment {
    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return this.number;
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public void printInfo() {
        System.out.println("Квартира №: " + getNumber() + " количество комнат " + getRooms().length);
    }
}

