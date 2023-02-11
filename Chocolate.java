package OOP1;

public class Chocolate extends Product {
    private Integer cacao;

    public Chocolate(String name, Double price, Integer cacao) {
        super(name, price);
        this.cacao = cacao;
    }

    @Override
    public String toString() {
        return String.format("%scacao = %d ", super.toString(), cacao);
    }
}
