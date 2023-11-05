package org.juaracoding.vhpijavafundamental.praktikum_2;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author LENOVO a.k.a. Virdha Haniva Pratiwie Ishak
Java Developer
Created on 03/11/2023 10:09
@Last Modified 03/11/2023 10:09
Version 1.0
*/

import java.util.Scanner;

public class Praktikum2 {
    public static void main(String[] args) {
        System.out.println("PRAKTIKUM 2 - LOGIKA PEMROGRAMAN JAVA");
        System.out.println("*Petunjuk*\nMasukkan angka sepuasnya. Jika sudah puas, masukkan karakter selain angka.");
        System.out.println("Maka akan diperoleh nilai rata-rata.");
        System.out.println("=====================================================================");

        Scanner snInput = new Scanner(System.in);
        System.out.println("\nMasukkan angka : ");

        int intAngka;
        double douTotal =0;
        int i = 0;
        boolean isValid = true;

        while (isValid) {
            try{
                intAngka = snInput.nextInt();
                douTotal = douTotal + intAngka;
            }
            catch(Exception e){
                isValid = false;
                double douRata2 = douTotal/i;
                System.out.print("Nilai rata-rata angka : "+douRata2);
            }
            i++;
        }
    }
}

