package com.tsion;

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
