package OOP1;

public class Milk extends Product {
    private Integer fat;

    public Milk(String name, Double price, Integer fat) {
        super(name, price);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return String.format("%sfat = %d ", super.toString(), fat);
    }
}
