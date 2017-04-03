package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

// объявил переменную массива, который будет двумерным
        int array[][];

        array = new int[5][5];

        Random random = new Random();

// бежим по всем строкам
        for (int i = 0; i < array.length; i++) {
// для каждой строки я пробегаю все стоблцы
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(25);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
            System.out.println("In " + i + " line min is " + min);
        }


        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println("In " + i + " line max is " + max);
        }

        int tmp;
        for (int i = 0; i < 5 / 2; i++) {
            for (int j = i; j < 5 - 1 - i; j++) {
                tmp = array[i][j];
                array[i][j] = array[5 - j - 1][i];
                array[5 - j - 1][i] = array[5 - i - 1][5 - j - 1];
                array[5 - i - 1][5 - j - 1] = array[j][5 - i - 1];
                array[j][5 - i - 1] = tmp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}