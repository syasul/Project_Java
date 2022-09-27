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
public class Arimatika {
    public static void main(String[] args) {
        int detik, menit, jam, konversi;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Detik = ");
        konversi = input.nextInt();
        
        jam = konversi / 3600;
        menit = (konversi % 3600)/60;
        detik = (konversi % 3600)%60;
        
        System.out.println("jadi jam ke = " + jam + " menit ke =  " + menit + " detik ke =  " + detik);
        
        
        
        
        
    } 
}
