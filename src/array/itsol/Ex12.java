/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.itsol;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = 0, col = 0;
        System.out.print("Enter row of matrix: ");
        row = in.nextInt();
        System.out.print("Enter the column of matrix: ");
        col = in.nextInt();
        int[][] m = new int[row][col];
        
        System.out.printf("Matrix (%d,%d):\n", row ,col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter [%d][%d]:  ", i, j);
                m[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Matrix before turn: ");
        Ex8.print_matrix(m, row, col);
        
        int[][] m1 = new int[row][col];
        
        for (int i=0; i<row;i++){
            for(int j =0; j<col;j++){
                System.out.printf("%4d",m[i][j]);
            }
            System.out.println("");
        }
        
        for (int i =0; i<row;i++) {
            for (int j =0; j<col;j++){
                m1[col-j-1][i]  =  m[i][j];
            }
        }
        System.out.println("");
        
        for(int i =0; i<col;i++){
            for(int j=0;i<row;j++){
                System.out.printf("%4d",m1[i][j]);
            }
            System.out.println("");
        }
        
    }
}
