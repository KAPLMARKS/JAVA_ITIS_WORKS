package com.company;
import static java.lang.Character.*;

/**
 * Created by acer on 22.03.2017.
 */
public class Parser {
    public static void parsInt (char[] number){
        int UnifiedNumber = 0;

        for (int i = 0; i < number.length; i++) {
            UnifiedNumber += ((int)number[i]- '0')*Math.pow(10,number.length-(i+1));
        }
        System.out.println(UnifiedNumber);
    }
}
