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
public class Ex5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array a : ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter length of array b : ");
        int m = in.nextInt();
        int[] b = new int[m];
        
        int pos;

        do {
            System.out.println("Enter position: ");
            pos = in.nextInt();
            if (pos <= n) {
                break;
            } else {
                System.out.println("Position must < than length of a[] !!!");
            }
        } while (true);
        
        System.out.println("Enter element for list A");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            a[i] = in.nextInt();
        }
        
        System.out.println("Enter element for list B");
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            b[i] = in.nextInt();
        }
        
        String A = Arrays.toString(a).replace("[", "").replace("]", "");
        String B = Arrays.toString(b).replace("[", "").replace("]", "");
        
        String C = A.substring(0, pos)+ " , " + B + A.substring(pos);
        C.replace("[", ","); 
        
        System.out.print("List a: ");
        System.out.print(A);
        System.out.print("\nList b: ");
        System.out.print(B);
        System.out.print("\n The Result: ");
        System.out.print(C);
    }
}
