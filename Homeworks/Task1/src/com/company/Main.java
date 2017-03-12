package com.company;

public class Main {

    public static void main(String[] args) {
	    int sum = 0;
	    int m = 1;
	    for (int i = 1; i <=10; i++){
	        if(i%2 == 0){
	            sum = sum +i;
            }
            if( i%2 == 1){
	            m = m * i;
            }
        }
        System.out.println(sum);
        System.out.println(m);
    }
}
