package com.tsion;

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
