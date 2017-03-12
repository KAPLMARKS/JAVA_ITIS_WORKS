package com.company;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 5;
        a[1] = 6;
        a[2] = -3;
        a[3] = 5;
        a[4] = 7;
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min + " " + max);
    }

}