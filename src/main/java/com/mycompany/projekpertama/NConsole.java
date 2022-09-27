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
import java.io.Console;

public class NConsole {
    public static void main(String []args){
        String nama;
        int usia;
        Console masukan = System.console();
        System.out.println("Masukkan Nama : ");
        nama = masukan.readLine();
        System.out.println("Masukkan Usia : ");
        usia = Integer.parseInt(masukan.readLine());
        System.out.println("Nama mu adalah : " + nama);
        System.out.println("Usia mu adalah : " + usia);
    }
}
