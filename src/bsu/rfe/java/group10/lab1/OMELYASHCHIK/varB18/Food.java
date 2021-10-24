package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;

import java.util.Objects;

public abstract class Food implements Consumable {
    public Food(String name) {
        this.name = name;
    }

    String name = null;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public void consume() {

    }
}
