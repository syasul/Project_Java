package com.mycompany.projekpertama;
import java.util.Scanner;

public class Projek_Pertama {

    public static void main(String[] args) {
        //memanggil scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Variabel
        String nik, nama, tempatLahir, tanggalLahir, alamat, jenisKelamin;
        int usia;
        
        // Input
        System.out.println("Masukkan data diri kamu!");
        System.out.println("========================");
        System.out.print("NIK : ");
        nik = keyboard.nextLine();
        System.out.print("Nama : ");
        nama = keyboard.nextLine();
        System.out.print("Tempat Lahir : ");
        tempatLahir = keyboard.nextLine();
        System.out.print("Tanggal Lahir 'dd/    mm/yyyy' : ");
        tanggalLahir = keyboard.nextLine();
        System.out.print("Alamat : ");
        alamat = keyboard.nextLine();
        System.out.print("Usia : ");
        usia = keyboard.nextInt();
        System.out.print("Jenis Kelamin 'L/P' : ");
        jenisKelamin = keyboard.nextLine();
        
        // Output
        System.out.println("");
        System.out.println("Halo " + nama + "!");
        System.out.println("Berikut data diri kamu!");
        System.out.println("=======================");
        System.out.println("NIK : " + nik );
        System.out.println("Nama : " + nama );
        System.out.println("Tempat. Tanggal Lahir : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        
        
        
        
    }
    
}
