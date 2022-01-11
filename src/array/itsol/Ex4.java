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
public class Ex4 {

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
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

        System.out.print("Enter X: ");
        int X = in.nextInt();

        
        int min = 100;
        

        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i])) {
                if (Math.abs(a[i] - X) < min) {
                    min = Math.abs(a[i] - X);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(Math.abs(a[i] - X) == min) {
                System.out.println("\n The result: "+ a[i]);
            }
        }

//        System.out.println("\nThe result: " + result);
    }

}
