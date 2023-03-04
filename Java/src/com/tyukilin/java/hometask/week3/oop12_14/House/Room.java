package com.tyukilin.java.hometask.week3.oop12_14.House;

public class Room {
    private boolean passageRoom;

    public Room(boolean passageRoom) {
        this.passageRoom = passageRoom;
    }

    public boolean isPassageRoom() {
        return this.passageRoom;
    }

    public void printInfo() {
        if (passageRoom == true) {
            System.out.println("Комната проходная");
        } else System.out.println("Комната не проходная");
    }
}



