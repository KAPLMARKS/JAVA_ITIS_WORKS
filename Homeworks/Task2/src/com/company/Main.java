package com.company;

public class Main {

    public static void main(String[] args) {
	    int array[] = new int[100];
        int num = 0;
        for ( int i = 0; i < array.length; i++){
	        if ( i% 10 == 6){
	            num++;
            }
        }
        System.out.println(num);
    }
}
