package com.tyukilin.java.hometask.week3.oop12_14.House;

public class HouseBuild {
    public static void main(String[] args) {
        Room roomOne = new Room(true);
        Room roomTwo = new Room(false);
        Room roomThree = new Room(false);
        Room[] threeRoom = {roomOne, roomTwo, roomThree};
        Room[] twoRoom = {roomOne, roomThree};
        Apartment apartmentThreeRoomsNumber1 = new Apartment(1, threeRoom);
        Apartment apartmentTwoRoomsNumber2 = new Apartment(2, twoRoom);
        Apartment apartmentTwoRoomsNumber3 = new Apartment(3, twoRoom);
        Apartment[] apartmentsInFloor = {apartmentThreeRoomsNumber1, apartmentTwoRoomsNumber2, apartmentTwoRoomsNumber3};
        Floor floorOne = new Floor(1, apartmentsInFloor);
        Floor floorTwo = new Floor(2, apartmentsInFloor);
        Floor[] floors = {floorOne, floorTwo};
        House house = new House(1, floors);
        printAllInformation(house);
    }

    public static void printAllInformation(House house) {
        house.printInfo();
        for (Floor floors : house.getFloor()) {
            floors.printInfo();
            for (Apartment apartment : floors.getApartments()) {
                apartment.printInfo();
                for (Room room : apartment.getRooms()) {
                    room.printInfo();
                }
            }
        }
    }
}


