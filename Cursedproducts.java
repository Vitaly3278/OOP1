package OOP1;

public class Cursedproducts extends Product {
    private Integer longvelity;

    public Cursedproducts(String name, Double price, Integer longevity) {
        super(name, price);
        this.longvelity = longevity;
    }

    @Override
    public String toString() {
        return String.format("%slong = %d ", super.toString(), longvelity);

    }
}
