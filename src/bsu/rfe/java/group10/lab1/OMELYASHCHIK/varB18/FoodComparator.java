package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;
import java.util.Comparator;
public class FoodComparator implements Comparator<Food> {
    @Override
    public int compare(Food arg0, Food arg1) {
        if(arg0 == null) return -1;
        if(arg1 == null) return 1;
        if (((Food) arg0).calculateCalories() == ((Food) arg1).calculateCalories()) return 0;
        if (((Food) arg0).calculateCalories() < ((Food) arg1).calculateCalories()) return -1;
        if (((Food) arg0).calculateCalories() > ((Food) arg1).calculateCalories()) return 1;
        return arg0.getName().compareTo(arg1.getName());
    }
}
