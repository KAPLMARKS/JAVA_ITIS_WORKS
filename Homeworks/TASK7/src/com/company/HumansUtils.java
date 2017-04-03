package com.company;

/**
 * Created by acer on 22.03.2017.
 */
public class HumansUtils {
    /**
     * Метод подсчитывает количество людей определенного возраста
     * @param humans массив людей
     * @return массив, где на i-ой позиции, стоит количество людей i-го возраста
     * Например ages[10] = 3;
     */
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
    public static void HumanMaxAge(int[]resultAge){
        int MaxAge = -1;
        int k = 0;

        for (int i = 0;i < resultAge.length; i++){
            if (resultAge[i] > MaxAge){
                MaxAge = resultAge[i];
                k = i;
            }
        }
        System.out.println();
        System.out.println("Human"+  k + "  " +"MaxAge"+ "=" + MaxAge);
    }

}
