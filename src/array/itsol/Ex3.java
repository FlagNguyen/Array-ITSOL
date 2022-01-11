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
public class Ex3 {

    public static boolean check_Duplicate(int[] a, int b, int i) { //Check xem số này đã được kiểm tra chưa
        for (int u = i - 1; u >= 0; u--) {
            if (a[i] == a[u]) {
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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = 1;
        }

        int[] c = new int[n];
        int max = 0;

        System.out.println("\nOUTPUT");
        System.out.printf("Number  |  Freq");
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (b[i] == 1 && check_Duplicate(a, a[i], i)) {

                //Đếm số lần xuất hiện
                b[i] = 0;
                for (int j = 1 + i; j < n; j++) {
                    if (a[j] == a[i]) {
                        count++;
                        b[j] = 0;

                    }
                }
                System.out.printf("\n %d          %d", a[i], count);

            }
            c[i] = count;
            if (c[i] > max) {
                max = a[i];
            }
        }

        System.out.println("\n Number has the greatest freq: " + max);

    }
}
