package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal( 99,
                5,);

        Animal.feed();

        Feed feed = animal.feed("Blue");

        System.out.println(feed.getWeight());

    }
}
