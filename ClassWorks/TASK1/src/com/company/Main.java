package com.company;

public class Main {

    public static void main(String[] args) {
	    int a[] = new int[7];
	    a[0] = 6;
	    a[1] = -6;
	    a[2] = -3;
	    a[3] = 4;
	    a[4] = 5;

	    for( int i = 5; i > 2 ; i--){
	        a[i]=a[i-1];
	        int temp = a[i];
	        System.out.println(temp);
        }
    }
}
