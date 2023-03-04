package com.tyukilin.java.hometask.week3.oop12_14.String;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task_2 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int result = sumValueOfArray(stringInArrayValue(value));
        System.out.println(result);
    }

    public static int[] stringInArrayValue(String string) {
        int[] num = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            if (48 <= string.charAt(i) && string.charAt(i) <= 57) {
                num[i] = string.charAt(i) - '0';
            }
        }
        return num;
    }

    public static int sumValueOfArray(int[] array) {
        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }
}


