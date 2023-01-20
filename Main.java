package com.tsion;

import com.tsion.animals;
import com.tsion.dog;


import com.tsion.animals;

public class dog extends animals {
    private int leg;
    private int tail;
    private int eyes;
    private int teeth;
    private int coat;

    public dog(String name, int leg, int tail,int eyes, int teeth , int size, int weight) {
        super(name, 1, 1, size, weight);
        this.leg=leg;
        this.tail=tail;
        this.eyes=eyes;
        this.teeth=teeth;
    }
    public void chew(){
        System.out.println("the com.tsion.dog can chew food." );
    }

    @Override
    public void eat() {
        System.out.println("the com.tsion.dog can eat");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("the animal can walk");
        move(5);
    }
}
public class animals {
    private String  name;
    private int brain;
    private int body;
    private int size;
    private int weight;
    public void eat (){
        System.out.println("the animal can eat.");

    }
    public void move(int speed){
        System.out.println(" the animal is moving in "+ speed+"m/s");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public animals(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
}


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
