package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverse(numbers);

    }

    private static void reverse(int[] input) {
        System.out.println("Который был :" + Arrays.toString(input));
        if(input == null || input.length <= 1){
            return;
        }
        for(int i = 0; i < input.length / 2; i++){
            int temp = input[i];
            input[i] = input[input.length -1 - i];
            input[input.length -1 -i] = temp;
        }
        System.out.println("Который получился :" + Arrays.toString(input));
    }
}
