package les13;

public class BurgerMain {
    public static void main(String[] args) {
        Burger usual = new Burger("Bun", "Meat", "Cheese", "Greens", "Mayo");
        Burger dietary = new Burger("Bun", "Meat", "Cheese", "Greens");
        Burger doubleMeat = new Burger("Bun", "Meat", "Meat", "Cheese", "Greens", "Mayo");
    }

}
