package com.tsion;

import com.tsion.animals;
import com.tsion.dog;

public class Main {
    public static void main(String[] args) {

        animals animal = new animals("cat",1,1,23,14);
        dog Dog = new dog("jack",4,1,2,32,23,43);
       // Dog.eat();
        Dog.walk();
        animal.move(9);
        System.out.println(Dog.getName());
        System.out.println(animal.getWeight());
    }
}