package com.company;

public class Cat extends Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяукает: мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает корм для кошек, ловит мышей и пьёт молоко");
    }

    @Override
    public void getDescription() {
        System.out.println("Домашняя кошка — млекопитающее семейства кошачьих отряда хищных, одно из наиболее популярных животных-компаньонов.");
    }

    @Override
    public String toString() {
        return "Кошка " + name;
    }
}
