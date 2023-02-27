package com.company;

public class Bear extends Animal {
    private String name;

    public Bear(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Медведь ревёт: РРРРРРРРРЭЭЭЭЭЭЭЭЭ");
    }

    @Override
    public void eat() {
        System.out.println("Медведь ест мясо, рыбу, мёд и малину");
    }

    @Override
    public void getDescription() {
        System.out.println("Медведь - семейство млекопитающих отряда хищных. Имеют короткий хвост, длинную и густую шерсть.");
    }

    @Override
    public String toString() {
        return "Медведь " + name;
    }
}
