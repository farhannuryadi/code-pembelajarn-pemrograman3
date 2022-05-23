package com.company;

import java.util.Locale;

public class pertemuan5c1 {
    public static void main(String[] args) {
        String kata1 = "Belajar";
        String kata2 = " Pemrograman ";
        String kata3 = "3";

        int angka = Integer.parseInt(kata3);//merubah string ke tipe numerik
        int nilai = angka+80;

        String kalimat = kata1.concat(kata2).concat(kata3);//mengabungkan dua buah string atau lebih
        System.out.println(kalimat);
        System.out.println(kalimat.toLowerCase());//merubah string menjadi huruf kecil semua
        System.out.println(kalimat.toUpperCase());//merubah string menjadi huruf besar semua
        System.out.println(kalimat.length());//menentukan panjang string
        System.out.println(kalimat.substring(3));//mengambil isi sebagian dari variabel string
        System.out.println(kalimat.substring(0,4));//mengambil isi sebagian dari variabel string
        System.out.println(kalimat.substring(8,17));//mengambil isi sebagian dari variabel string

        System.out.println(nilai);
        System.out.println(kata1.equals("belajar"));//membandingkan dua buah string dengan membedakan huruf kecil dan besar
        System.out.println(kata1.equalsIgnoreCase("belajar"));//membandingkan dua buah string tanpa membedakan huruf kecil dan besar

    }
}
