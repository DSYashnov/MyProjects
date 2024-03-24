package les10;

import javax.swing.*;
import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();

        int[][] matrix1 = new int[M][N];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = s.nextInt();
            }
        }
        int [][] transposedMatrix = new int[N][M];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                transposedMatrix[j][i] = matrix1[i][j];
            }
        }
        System.out.println("First matrix:");
        printMatrix(matrix1);

        System.out.println("Second matrix:");
        printMatrix(transposedMatrix);
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
