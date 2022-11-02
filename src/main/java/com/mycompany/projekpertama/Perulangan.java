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
public class Perulangan {
    public static void main(String []args){
//        loop
        int sum = 0;
        for (int i = 5; i <= 10; i++)
        {
            sum = sum +i;
            System.out.println("sum ke = " + sum);
            System.out.println("i ke = " + i);
        }
        
//        loop
        for (int i = 5; i >= 1; i--)
        {
            System.out.println("0");
        }
        
//        nested loop
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("i");
            }
            System.out.println(" ");
        }
        
//        while
        int i = 0;
        while(i<=5){
            System.out.println("i");
        i++;
        }
        
//        do while
          
//       latihan do while dan for
//        Scanner masukan = new Scanner(System.in);
//        System.out.print("Masukkan Nilai Awal : ");
//        int awal = masukan.nextInt();
//        System.out.println("Masukkan Nilai Akhir : ");
//        int akhir = masukan.nextInt();
//        for (int j = awal; j <= akhir; j++){
//            if (j%2==0)
//            {
//                System.out.println("i");
//            }
//        }
//        int x = awal;
//        while(x <= akhir){
//            System.out.println(x);
//        }
        

        
        
        
        
        
               
        

        
//        loop A
        for (int c = 5; c >= 1; c--) {
            for (int d = 1; d <= c; d++) {
                System.out.print(d+" ");
            }
            System.out.println("");
        }
//        loop B
        for (int e = 5; e>=1; e--) {
            for (int f = e; f >= 1; f--){
                System.out.print(f+" ");
            }
            System.out.println("");
        }
        
//        loop C

        for (int g = 1; g<= 5; g++){
            for (int h = 1; h <= 4; h++)
            {
                System.out.print("*");   
            }
            System.out.println("0");
        }
        
//        loop D
        
        for (int o = 5; o > 0; o--){
            System.out.print("0");
            for (int p = 0; p < 5; p++) {
                System.out.print(o > 4 ? "0" : "*");
            }
            System.out.println(" ");
            

        }
        
//        loop E

        for (int s = 0; s < 5; s++){
            for (int t = 0; t < 5; t++){
                System.out.print(s == t ? "0" : "*");
            }
            System.out.println("");
            
        }
        
        
        
//        loop F
        
        for (int j = 5; j > 0; j--){
            System.out.print("");
            for (int k = 0; k < 5; k++) {
                System.out.print(j < 2 ? "0" : "*");
            }
            System.out.println("0");
            

        }

    }
}
