package OOP1;

public class Beer extends Product {
    private Integer alcohol = 0;

    public Beer(String name, Double price) {
        super(name, price);
    }

    public Beer(String name, Double price, Integer alcohol) {
        this(name, price);
        this.alcohol = alcohol;
    }

    @Override
    public String toString() {
        return String.format("%salcohol = %d ", super.toString(), alcohol);
    }
}
