package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Шарик");
        animals[1] = new Cat("Вася");
        animals[2] = new Bear("Боря");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + " идёт к ветеринару");
        }

        for (int i = 0; i < animals.length; i++) {
            animals[i].makeNoise();
            animals[i].eat();
        }
    }
}
