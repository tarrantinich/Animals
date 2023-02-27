package com.company;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает: гав-гав-гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает корм для собак и грызёт кости");
    }

    @Override
    public void getDescription() {
        System.out.println("Собака — домашнее животное, одно из наиболее популярных (наряду с кошкой) животных-компаньонов.");
    }

    @Override
    public String toString() {
        return "Собака " + name;
    }
}
