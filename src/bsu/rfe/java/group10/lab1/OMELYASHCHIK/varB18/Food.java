package bsu.rfe.java.group10.lab1.OMELYASHCHIK.varB18;

public abstract class Food implements Consumable {
    String name = null;
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) return false;
        if (name == null || ((Food)obj).name==null) return false;
        return  name.equals(((Food)obj).name);
    }

    public  void setName(String name){
        this.name = name;

    }
    public void Food(String name){
        this.name = name;
    }
    @Override
    public void consume() {

    }
}
