package Array;

public class Main {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[10];
        System.out.println(myArray.length);


        String[] season = new String[4];

        season[0] = "Winter";
        season[1] = "Spring";
        season[2] = "Summer";
        season[3] = "Autumn";

        String[] seasons =  {
                "Winter", "Spring", "Summer", "Autumn"
        };

        for (int i = 0; i < 4; i++){
            System.out.println(seasons[i]);
        }

    }
}