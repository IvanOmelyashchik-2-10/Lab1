package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;
    import java.util.Arrays;
    import java.util.Comparator;
public class MainApplication {
    public static void main(String[] args) {
        Food[] breakfast = new Food[20];
        boolean sort_needed = false;
        boolean calories_needed = false;
        System.out.println("длина массива аргументов: " + args.length);

        for (int itemIndex = 0; itemIndex < args.length; itemIndex++) {
            if (args[itemIndex].equals("-calories")) {
                calories_needed = true;
            } else if (args[itemIndex].equals("-sort")) {
                sort_needed = true;
            } else {
                String[] parts = args[itemIndex].split("/");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[0].equals("Cheese")) {
                        breakfast[i] = new Cheese();

                    } else if (parts[0].equals("Apple")) {
                        breakfast[i] = new Apple(parts[1]);

                    } else if (parts[0].equals("Coffee")) {
                        breakfast[i] = new Coffee(parts[1]);

                    }

                }
            }
        }
        int count_breakfast = args.length - 2;
        for (int i = 0; i < count_breakfast; ++i) {

        }
        System.out.println("Кол-во" + count_breakfast);
        for (int i = 0; i < count_breakfast; i++) {
            if (breakfast[i] == null) break;
            breakfast[i].consume();
        }

        Food[] breakfast_diff = new Food[count_breakfast];
        /*for (int i = 0; i < count_breakfast; i++) {
            count = 1;
            boolean to_continue = false;
            for(int j = 0; j < count_breakfast; j++)
            {
                if(breakfast_diff[j] == null) continue;
                if(breakfast_diff[j].equals(breakfast[i])){
                    to_continue = true;
                }
            }
            if(to_continue) continue;
            for (int j = i + 1; j < count_breakfast; j++) {
                if ((breakfast[j].equals(breakfast[i]))) {
                    count++;
                }
            }
            breakfast_diff[i] = breakfast[i];
            breakfast[i].consume();
            System.out.println(count + " раз(а)");
        }*/

        int count = 0;
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast_diff.equals(breakfast[i])) {
                count++;
            }
        }
            if (calories_needed) {
                int calorii = 0;
                for (int i = 0; i < count_breakfast; i++)
                    calorii += breakfast[i].calculateCalories();
                System.out.println("калорийность: " + calorii);
            }
            if (sort_needed) {
                Arrays.sort(breakfast, new Comparator() {
                    public int compare(Object f1, Object f2) {
                        if (f1 == null) return 1;
                        if (f2 == null) return -1;
                        if (((Food) f1).calculateCalories() == ((Food) f2).calculateCalories()) return 0;
                        if (((Food) f1).calculateCalories() < ((Food) f2).calculateCalories()) return -1;
                        return 1;
                    }
                });
                System.out.println("отсортированные продукты");
                for (int i = 0; i < count_breakfast; i++) {
                    if (breakfast[i] == null) continue;
                    System.out.println(breakfast[i].toString() + " " + breakfast[i].calculateCalories());
                    //breakfast[i].consume();
                }
                System.out.print("Съедено продуктов: " + count_breakfast);
                System.out.print("\nвсего хорошего!");
            }

        }
    }

