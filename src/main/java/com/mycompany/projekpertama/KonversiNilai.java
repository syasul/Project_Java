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
public class KonversiNilai {
public static void main(String[] args) {
        String nama, matkul, nim, grade = "";
        int angka;
        
        Scanner Masukan = new Scanner(System.in);
        
        System.out.print("Masukkan NIM : ");
        nim = Masukan.nextLine();
        
        System.out.print("Masukkan Nama : ");
        nama = Masukan.nextLine();
        
        System.out.print("Masukkan Mata Kuliah : ");
        matkul = Masukan.nextLine();
        
        System.out.print("Masukkan Angka : ");
        angka = Masukan.nextInt();
        
        String prodi = nim.substring(3, 5);
        
        switch (prodi)
        {
            case "52":
                System.out.println("prodi S1 TI");
                break;
            case "51":
                System.out.println("prodi S1 SI");
                break;
            case "31":
                System.out.println("prodi D3 SI");
                break;
            default:
                System.out.println("Masukkan Salah");
                break;
        }
        
        if (angka >= 85 && angka <= 100 ) {
            grade = "A";
            System.out.println("Grade Mahasiswa ini "+grade);
        } else if (angka >= 80 && angka <= 84) {
            grade = "A-";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 75 && angka <= 79) {
            grade = "B+";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 70 && angka <= 74) {
            grade = "B";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 65 && angka <= 69) {
            grade = "B-";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 60 && angka <= 64) {
            grade = "C+";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 55 && angka <= 59) {
            grade = "C";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 50 && angka <= 54) {
            grade = "C-";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 45 && angka <= 49) {
            grade = "D";
            System.out.println("Grade Mahasiswa ini "+grade);
        }else if (angka >= 0 && angka <= 44) {
            grade = "E";
            System.out.println("Grade Mahasiswa ini "+grade);
        } else {
            System.out.println("Masukkan Anda Salah !!!!");
        }
        
        switch (grade) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                 break;
            case "B+":
                System.out.println("Memuaskan");
                break;
            case "B":
                System.out.println("Memuaskan");
                break;
            case "B-":
                System.out.println("Memuaskan");
                break;
            case "C+":
                System.out.println("Cukup");
                break;
            case "C":
                System.out.println("Cukup");
                break;
            case "C-":
                System.out.println("Cukup");
                break;
            case "D":
                System.out.println("Kurang");
                break;
            case "E":
                System.out.println("Sangat Kurang");
                break;
        }
        
        
        
        
        
        
                
    }
    
}
