package com.company;

public class Main {
    public static void main(String[] args) {
        char[] b = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] c = new char[]{'e', 'l', 'l'};
        int p = 0;
        for (int i = 0; i < b.length; i++) {
            p = 0;
            int l = i;
            for (int j = 0; j < c.length; j++) {
                if (b[i] == c[j]) {
                    p = 1;
                    if (p == 1) {
                        System.out.println(i);
                     }
                 }
             }
         }
    }
}