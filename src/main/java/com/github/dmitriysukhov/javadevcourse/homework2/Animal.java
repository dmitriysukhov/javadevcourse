package com.github.dmitriysukhov.javadevcourse.homework2;

public class Animal {

    private double energy;
    private int age;
    private String name;

    private double distance; //пройденная дистанция

    public Animal(int energy, int age, String name) {
        this.energy = energy;
        this.age = age;
        this.name = name;
    }

    public double getEnergy() {
        return energy;
    }

    //нельзя сделать отрицательную энергию
    public void setEnergy(double energy) {
        if(energy < 0)
            energy = 0;
        this.energy = energy;
    }

    public int getAge() {
        return age;
    }

    //нельзя сделать отрицательный возраст
    public void setAge(int age) {
        if (age < 0)
            age = 0;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    //усвояемость пищи лучше до 5 лет и хуже после 10, поэтому добавлен коэффициент усвояемости
    public void eat(int kcal) {
        double coef = 1;

        if (this.age < 5)
            coef = 1.1;
        else if(this.age > 10)
            coef = 0.9;
        this.energy += kcal * coef;
    }

    //можно пройти столько сколько позволяет уровень энергии
    public void move(double distance){
        if(distance <= 0)
            return;
        if(this.energy == 0)
            return;
        double min = Math.min((double)this.energy, distance);
        this.energy -= min;
        this.distance += min;
    }

    //двигаться с определенным уровнем сложности, от этого зависит кол-во затраченной энергии
    public void moveWithDifficultyLevel(double distance, double coef) {
        double currentEnergy = getEnergy();
        double currentDistance = getDistance();

        if(distance <= 0)
            return;
        if(currentEnergy == 0)
            return;
        double min = Math.min(currentEnergy, distance * coef);
        setEnergy(currentEnergy - min);
        setDistance(currentDistance + (min / coef));
    }
}
