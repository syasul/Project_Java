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
public class Percabangan {

    public static void main(String[] args) {
        int angka;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        angka = masukan.nextInt();
        if (angka % 2 == 0)
        {
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
        
        if (angka % 2 == 0)
        {
            if (angka > 10)
            {
                System.out.println("Bilangan Genap dan");
                System.out.println("Merupakan Bilangan lebih dari 10");
            }
        }
        String hasil = angka%2==0 ? "Bilangan Genap" + " halo angka " + angka : "Bilangan Ganjil";
        System.out.println("Maka : " + hasil);
    }
    
}
