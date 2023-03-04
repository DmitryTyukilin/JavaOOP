package com.tyukilin.java.hometask.week4.oop14_15.CashMachine;

public class Account {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10, 3, 4);
        cashMachine.addManyFiftyEuros(0);
        cashMachine.addManyTwentyEuros(0);
        cashMachine.addManyTenEuros(0);
        if ((cashMachine.isgetMany(280))) {
            System.out.println("Наличные выданы успешно!" + "остаток на счете " + cashMachine.balance());
        } else System.out.println("Не достаточно средств");
    }
}
