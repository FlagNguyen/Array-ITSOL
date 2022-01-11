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
public class Ex2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            a[i] = in.nextInt();
        }
        System.out.println("\nBefore sorting: ");
        System.out.println(Arrays.toString(a));

        int temp = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(a));

    }
}
