package les5;

public class War {
    public static void main(String[] args) {
        int aragorn1 = 13 * 860;
        int legolas1 = 24 * 860;
        int boromir1 = 46 * 860;

        int aragorn2 = 13;
        int legolas2 = 24;
        int boromir2 = 46;

        double min = 860 * 1.5;

        double liWar = aragorn1 + legolas1 + boromir1;
        double minWar = (aragorn2 * min) + (legolas2 * min) + (boromir2 * min);

        System.out.println(liWar);
        System.out.println(minWar);

    }
}
