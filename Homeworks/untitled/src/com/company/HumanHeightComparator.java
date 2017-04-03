package com.company;

/**
 * Created by acer on 29.03.2017.
 */
public class HumanHeightComparator implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        return ((Human)a).getHeight() - ((Human)b).getHeight();
    }
}
