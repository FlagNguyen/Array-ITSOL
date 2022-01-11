/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.itsol;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex1 {

    public static boolean check_MangDX(int a[], int n) {
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            a[i] = in.nextInt();
        }

        if (check_MangDX(a, n)) {
            System.out.println("\nThis is symetrical array.");
        } else {
            System.out.println("\nThis is not symetrical array.");
        }
    }

}
