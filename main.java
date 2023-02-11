package OOP1;

public class main {
    public static void main(String[] args) {
        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays", 120.32))
                .addProduct(new Product("Cola", 10.12))
                .addProduct(new Product("Fanta", 12.35))
                .addProduct(new Product("Sprite", 14.73))
                .addProduct(new Beer("Alcoholfree", 14.73))
                .addProduct(new Beer("Beer", 14.73, 5))
                .addProduct(new Milk("Milk", 8.73, 3))
                .addProduct(new Cursedproducts("Buratino", 14.73, 8))
                .addProduct(new Chocolate("Chocolate", 3.13, 75));

        for (Product prod : store.getProducts()) {
            System.out.println(prod);

        }

        System.out.println("----------------------------");
        System.out.println("Searcing: ");
        System.out.println(store.findProduct("Lays"));
        System.out.println(store.findProduct("Sprite"));

        System.out.println("We a buy Lays");
        store.buy("Lays", 120.32);
        System.out.println(store);

        store.buy("Cola", 10.12);
        System.out.println(store);

        System.out.println("We a buy Beer");
        store.buy("Beer", 14.73);
        System.out.println(store);

        System.out.println("We a buy Fanta");
        store.buy("Fanta", 14.73);
        System.out.println(store);
    }
}
