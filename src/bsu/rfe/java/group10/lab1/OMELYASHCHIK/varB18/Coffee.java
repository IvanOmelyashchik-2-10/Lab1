package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;

import java.util.Objects;

public class Coffee extends Food {
    private String aroma;
    public Coffee( String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public void consume() {
        System.out.println(this + "выпит");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(aroma, coffee.aroma);
    }

    @Override
    public String toString() {
        return super.toString() + "c ароматом '" + aroma.toUpperCase() + "'";
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        if(aroma.equals("Насыщенный")){
            calories += 40;
        }
         else if (aroma.equals("Восточный")){
            calories += 80;
        }
         else if (aroma.equals("Горький")){
             calories += 120;
        }
        return calories;
    }
}
