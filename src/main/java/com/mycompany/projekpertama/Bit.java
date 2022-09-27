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
public class Bit {
    public static void main(String []args){
        int a = 2, b = 4, c;
        c = a&b ;
        System.out.println("a AND b = " + c);
        c = a|b ;
        System.out.println("a OR b = " + c);
        c = a^b ;
        System.out.println("a XOR b = " + c);
        c = ~a ;
        System.out.println("NOT a = " + c);
        c = a<<b ;
        System.out.println("a geser kiri  = " + c);
        c = a>>b ;
        System.out.println("a geser kanan = " + c);
    }
}
