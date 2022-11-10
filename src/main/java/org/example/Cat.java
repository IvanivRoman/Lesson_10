package org.example;

import java.awt.*;

public class Cat extends Predator {
    private String species;

    public Cat() {
    }

    public Cat(Color color, double weight, String species) {
        super(color, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String sleep() {
        return "mrmrmrmrrmrmrmr";
    }

    public String hunt() {
        return "Shhhhh!!! I`m hunting!";
    }

    public String doSomethingIncomprehensible() {
        return "ТИГИДИК";
    }

    public String lickBalls() {
        return "There is nothing interesting to do, so i can lick my balls.";
    }

    public String catWorkingSchedule(WeekDays weekDays) {
        return switch (weekDays) {
            case MON, WED, FRI -> sleep();
            case TUE, THU, SAT -> hunt();
            case SUN -> doSomethingIncomprehensible();
            default -> lickBalls();
        };
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Cat) && (((Cat) o).getSpecies().equals(this.species)));
    }

    @Override
    public int hashCode() {
        return species.hashCode();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + species + '\'' +
                '}';
    }
}