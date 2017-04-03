package com.company;

/**
 * Created by acer on 29.03.2017.
 */
public class Rectangle implements Comparable {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int area() {
        return a * b;
    }

    public String toString() {
        return this.a + " " + this.b;
    }

    public int compareTo(Object object);{
    Rectangle that = (Rectangle)Object;
        return this.area() - that.area();

        public static int  minElements(Rectangle rectangles[]);
         for(k=0; k < rectangles .length; k++)
        }
}

}
