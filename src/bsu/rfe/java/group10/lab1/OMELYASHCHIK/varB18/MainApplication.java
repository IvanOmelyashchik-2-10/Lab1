package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;

public class MainApplication {

    public static void main(String[] args) throws Exception{
        Food[] breakfast = new Food[args.length];
        boolean sort_neaded = false;
        boolean calories_neaded = false;
        System.out.println("длина массива аргументов: " + args.length);
        int count_breakfast = 0;
        for (int itemIndex = 0; itemIndex < args.length; itemIndex++) {
            if (args[itemIndex].equals("-calories")) {
                calories_neaded = true;
            } else if (args[itemIndex].equals("-sort")) {
                sort_neaded = true;
            } else {
                String[] parts = args[itemIndex].split("/");
                String[] param = new String[parts.length - 1];
                for (int i = 0; i < parts.length - 1; i++) {
                    param[i] = parts[i + 1];
                }
            }
        }
            for (Food item : breakfast){
                item.consume();
            }
            
    }
}
