package org.example;

import java.awt.*;

public abstract class Predator {
    private Color color;
    private double weight;

    public Predator() {
    }

    public Predator(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract String sleep();

    public abstract String hunt();
}