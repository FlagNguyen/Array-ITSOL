/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.itsol;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex8 {

    public static void print_matrix(int[][] a, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("[%d]", a[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0, m = 0, k = 0;
        System.out.print("Enter row of matrix 1: ");
        m = in.nextInt();
        System.out.print("Enter the column of matrix 1 and the row of matrix 2: ");
        n = in.nextInt();
        System.out.print("Enter the column of matrix 2: ");
        k = in.nextInt();

        int[][] m1 = new int[m][n];
        int[][] m2 = new int[n][k];
        int[][] m3 = new int[m][k];
        System.out.printf("Matrix 1 (%d,%d):\n", m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter [%d][%d]:  ", i, j);
                m1[i][j] = in.nextInt();
            }
        }

        System.out.printf("Matrix 2 (%d,%d):\n", n, k);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.printf("Enter [%d][%d]:  ", i, j);
                m2[i][j] = in.nextInt();
            }
        }

        System.out.println("Matrix 1: ");
        print_matrix(m1, m, n);
        System.out.println("Matrix 2: ");
        print_matrix(m2, n, k);

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; i < k; j++) {
                for (int z = 0; z < n; z++) {
                    m3[i][j] += m1[i][z] * m2[z][j];
                }
            }
        }

        System.out.println("Matrix 3: ");
        print_matrix(m3, m, k);

    }

}
