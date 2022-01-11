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
public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            a[i] = in.nextInt();
        }
        
        int[] b = new int[n];
        int max =0;
        
        for (int i =0; i<n; i++){
            b[i] =1;
            for (int j=i; j<n-1;j++){
                if(a[j] <= a[j+1]){
                    b[i]++;
                }
                
                if (a[j] > a[j+1]) break;
            }
            if (b[i] > max) max =b[i];
        }
        System.out.println("\nOUTPUT: ");
        System.out.print("\nThe longest run is "+max);
        
        for (int i=0; i<n; i++){
            if(max == b[i]) System.out.print(", begin from element "+(i+1));
        }
        
    }

}
