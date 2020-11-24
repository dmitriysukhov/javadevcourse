package com.github.dmitriysukhov.javadevcourse.homework2;

public class Cat extends Animal {
    public Cat(int energy, int age, String name) {
        super(energy, age, name);
    }

    public String sound(){
        String result = "Мяу! Меня зовут " + getName();
        return result;
    }

    //лазать по деревьям в 5 раз сложнее чем двигаться
    public void climb(double distance) {
        moveWithDifficultyLevel(distance, 5);
    }
}
