package les13;

public class Burger {
    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Ви замовили звичайний бургер, який містить: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Ви замовили дієтичний бургер, який містить: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String meat2, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Ви бургер з подвійним м'ясом, який містить: " + bun + ", " + meat + ", " + meat2 + ", " + cheese + ", " + greens + ", " + mayo);
    }

    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;
    private String meat2;



}
