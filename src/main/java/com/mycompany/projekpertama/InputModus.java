/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projekpertama;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class InputModus {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Inputkan jumlah data : ");

        int n = input.nextInt(), c;
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Masukkan " + n + " data");

        int value = 0;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
         }

        for (int i = 0; i < n; i++) {
            c = 1;
            if (a[i] == -1) {
                    b[i] = 0;
                } else {
                    for (int j = 1; j < n; j++) {
                        if (a[i] == a[j]) {
                            c++;
                            a[j] = -1;
                        }
                    }
                    b[i] = c;
            }
        }

        int m = b[0];

        for (int i = 1; i < n; i++) {
            if (b[i] >= m) {
                m = b[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                value = a[i];
            }
        }
        System.out.println("Hasil modus adalah : " + value);
    }
}
