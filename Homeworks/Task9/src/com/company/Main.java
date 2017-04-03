package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = new int [3][3];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = random.nextInt(17);
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++ ){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------");
        MinMaxReversMatrix(matrix);

    }
    public static void MinMaxReversMatrix( int [][] matrix){
        int min,max;
        int indexMin;
        int indexMax;
        for (int i = 0;i < matrix.length;i++){
            min = matrix[i][0];
            max = matrix [i][0];
            indexMin = 0;
            indexMax = 0;
            for (int j = 0; j < matrix[0].length;j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                    indexMin = j;
                }
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    indexMax = j;
                }
            }
            matrix[i][indexMax] = min;
            matrix[i][indexMin] = max;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++ ){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}