package com.company;

/**
 * Created by acer on 29.03.2017.
 */
public interface Comparable {
    // метод возвращет положительное число, если
    // наш объект БОЛЬШЕ object
    // отрицательно - МЕНЬШЕ
    // 0 когда равны
    int compareTo(Object object);

}
