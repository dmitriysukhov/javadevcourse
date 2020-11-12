package com.github.dmitriysukhov.javadevcourse.homework2;

public class Dog extends Animal {
    public Dog(int energy, int age, String name) {
        super(energy, age, name);
    }

    public String sound(){
        String result = "Гав! Меня зовут " + getName();
        return result;
    }

    //плавать в 10 раз сложнее чем двигаться
    public void swim(double distance) {
        moveWithDifficultyLevel(distance, 10);
    }
}
