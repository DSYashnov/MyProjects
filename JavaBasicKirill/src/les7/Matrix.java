package les7;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int [][] firstMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < firstMatrix.length; i++){
            int temp = firstMatrix[i][i];
            firstMatrix[i][i] = firstMatrix[i][firstMatrix.length - 1 -i];
            firstMatrix[i][firstMatrix.length - 1 - i] = temp;
        }

        for (int i = 0; i < firstMatrix.length; i++){
            for (int j = 0; j < firstMatrix[i].length; j++){
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
