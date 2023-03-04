package com.tyukilin.java.hometask.week3.oop12_14.String;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task_1 {
    public static void main(String[] args) {
        String string = "abc Cpddd adawdddggg";
        String st1 = string.replaceAll(" ", "").toUpperCase();
        char[] st2 = st1.toCharArray();
        for (int i = 0; i < st2.length - 1; i++) {
            if (st2[i] == st2[i + 1]) {
                st2[i] = '0';
            }
        }
        String myStr = new String(st2);
        System.out.println(myStr.replaceAll("0", ""));
    }
}

