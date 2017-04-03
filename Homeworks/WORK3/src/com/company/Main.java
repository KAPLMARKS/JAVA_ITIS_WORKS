package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	 Human human = new Human("Marat", 11);
	 Human human1 = new Human("Marat", 32);
	 Human human2 = new Human("Marat", 19);
	 Human human3 = new Human("Marat", 17);
	 Human human4 = new Human("Marat", 78);
	 Human human5 = new Human("Marat", 90);
	 Human human6 = new Human("Marat", 91);

	 System.out.println(human.equals(human1));

	 Human humans[] = { human, human1, human2, human3 , human4 ,human5, human6,};
        int countAges[] = new int[120];

        for (int i = 0; i < humans.length; i++) {
            countAges[humans[i].getAge()] ++;
        }

        for (int i = 0; i < countAges.length; i++) {
            System.out.println(countAges[i]);
        }
        HumansUtils.countAges(humans);





    }
}
