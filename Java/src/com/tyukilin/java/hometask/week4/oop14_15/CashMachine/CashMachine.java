package com.tyukilin.java.hometask.week4.oop14_15.CashMachine;

/**
 * Создать класс, описывающий банкомат.
 * * Банкомат задается тремя свойствами:
 * * - количеством купюр номиналом 10, 20 и 50.
 * * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * * Сделать методы для добавления денег в банкомат.
 * * Сделать метод, снимающий деньги: он принимает сумму денег,
 * * а возвращает булево значение - успешность выполнения операции.
 * * При снятии денег метод должен распечатывать каким количеством
 * * купюр какого номинала выдаётся сумма. Сначала
 * * банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20,
 * * и только затем 10 (не нужно рассматривать более сложные варианты выдачи
 * * наличных, чтобы не усложнять алгоритм).
 */
public class CashMachine {
    private int fiftyEuros;
    private int twentyEuros;
    private int tenEuros;
    private static final int fifty = 50;
    private static final int twenty = 20;
    private static final int ten = 10;

    public CashMachine(int fiftyEuros, int twentyEuros, int tenEuros) {
        this.fiftyEuros = fiftyEuros * fifty;
        this.twentyEuros = twentyEuros * twenty;
        this.tenEuros = tenEuros * ten;
    }

    public void addManyFiftyEuros(int fiftyEuros) {
        this.fiftyEuros = this.fiftyEuros + fiftyEuros * fifty;
    }

    public void addManyTwentyEuros(int twentyEuros) {
        this.twentyEuros = this.twentyEuros + twentyEuros * twenty;
    }

    public void addManyTenEuros(int tenEuros) {
        this.tenEuros = this.tenEuros + tenEuros * ten;
    }

    public boolean isgetMany(int sum ) {
        int sumValue = fiftyEuros + twentyEuros + tenEuros;
        int currentFifty = 0;
        int currentTwenty = 0;
        int currentTen = 0;
        if (sum <= sumValue && sum > 0) {
            while (sum / fifty > 0) {
                sum = sum - fifty;
                currentFifty++;
            }
            this.fiftyEuros = this.fiftyEuros - currentFifty * fifty;
            if (currentFifty > 0) {
                System.out.println(currentFifty + " - " + fifty);
            }

            while (sum / twenty > 0) {
                sum = sum - twenty;
                currentTwenty++;
            }
            this.twentyEuros = this.twentyEuros - currentTwenty * twenty;
            if (currentTwenty > 0) {
                System.out.println(currentTwenty + " - " + twenty);
            }

            while (sum / ten > 0) {
                sum = sum - ten;
                currentTen++;
            }
            this.tenEuros = this.tenEuros - currentTen * ten;
            if (currentTen > 0) {
                System.out.println(currentTen + " - " + ten);
            }
        } else return false;

        return sumValue - currentFifty * fifty - currentTwenty * twenty - currentTen * ten >= 0;
    }
    public int balance () {
        int balance = fiftyEuros + twentyEuros + tenEuros;
        return balance;
    }
}



