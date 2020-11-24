package com.github.dmitriysukhov.javadevcourse.homework2;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal(1000,5,"AnimalName");

    @org.junit.jupiter.api.Test
    void moveWithDifficultyLevel() {
        animal.moveWithDifficultyLevel(100,10);
        assertEquals(animal.getEnergy(),0);
        assertEquals(animal.getDistance(),100);
    }
}