package com.company;

/**
 * Created by acer on 29.03.2017.
 */
public class HumanUtils {

    public static int[] countAges(Human[] humans) {
        int[] resultAges = new int[120];

        for (int i = 0; i < humans.length; i++) {
            int currentAge = humans[i].getAge(); // возраст i-го человека
            // resultAges[currentAge] = resultAges[currentAge] + 1;
            resultAges[humans[i].getAge()]++;
        }
        HumanMaxAge(resultAges);

        return resultAges;
    }

    public static void HumanMaxAge(int[] resultAge) {
        int MinAge = 100;
        int k = 0;

        for (int i = 0; i < resultAge.length; i++) {
            if (resultAge[i] < MinAge) {
                MinAge = resultAge[i];
                k = i;
            }
        }
        System.out.println();
        System.out.println("Human" + k + "  " + "MinAge" + "=" + MinAge);
    }
}