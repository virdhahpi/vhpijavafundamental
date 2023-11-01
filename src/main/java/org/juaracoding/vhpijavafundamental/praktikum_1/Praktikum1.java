package org.juaracoding.vhpijavafundamental.praktikum_1;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author LENOVO a.k.a. Virdha Haniva Pratiwie Ishak
Java Developer
Created on 01/11/2023 10:29
@Last Modified 01/11/2023 10:29
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner snInput = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strAscii = snInput.nextLine();

        int intHasil = 0;
        for (int i = 0; i < strAscii.length(); i++) {
            char chX = strAscii.charAt(i);
            int intAscii = chX;
            if (intAscii >= 32 && intAscii <= 90) {
                intHasil = intHasil + intAscii;
            }
        }
        System.out.print("Hasil : " + intHasil);
    }
}

