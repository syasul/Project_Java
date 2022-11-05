/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projekpertama;

/**
 *
 * @author User
 */
public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = new int[] {44, 23, 55, 76, 21, 100};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <  min) {
                min = arr[i];
            }
        }
        System.out.println("Bilangan terkecil dari array adalah : " + min);
    }   
}
