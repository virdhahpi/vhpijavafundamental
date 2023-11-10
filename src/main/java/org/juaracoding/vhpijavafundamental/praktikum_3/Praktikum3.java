package org.juaracoding.vhpijavafundamental.praktikum_3;
/*
Created by IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IC-232.10072.27, built on October 11, 2023
@Author LENOVO a.k.a. Virdha Haniva Pratiwie Ishak
Java Developer
Created on 09/11/2023 9:13
@Last Modified 09/11/2023 9:13
Version 1.0
*/

import java.util.Random;

public class Praktikum3 {
    public static void main(String[] args) {
        Random random = new Random();
        int intLengthData = 0;
        int intPilihAwal = 0;
        String strVokal = "aiueo";
        String strKons = "bcdfghjklmnpqrstvwxyz";
        int intHurufAwal = 97;
        int intHurufAkhir = 123;
        char chHurufAcak = 'a';
        String strKarakter = "";
        for (int i = 0; i < 1; i++) {
            strKarakter = "";
            intLengthData = random.nextInt(12, 26);
            intPilihAwal = random.nextInt(0, 2);
            for (int j = 0; j < intLengthData; j++) {
                if (j < 8) {
                    if (intPilihAwal == 0) {
                        int intVokal = random.nextInt(1, 6);
                        strKarakter = strKarakter + strVokal.charAt(intVokal - 1);
                        if (j == 0) {
                            strKarakter = strKarakter.toUpperCase();
                        }
                        intPilihAwal = 1;
                    }
                    else {
                        int intKons = random.nextInt(1, 22);
                        strKarakter = strKarakter + strKons.charAt(intKons - 1);
                        if(j==0){
                            strKarakter = strKarakter.toUpperCase();
                        }
                        intPilihAwal = 0;
                    }
                }
                else {
                    chHurufAcak = (char) random.nextInt(intHurufAwal, intHurufAkhir);
                    strKarakter = strKarakter + chHurufAcak;
                }
            }
            System.out.println("Jumlah karakter random yang dihasilkan: "+intLengthData);
            System.out.println("Hasil karakter random -> "+strKarakter);
        }
    }
}

