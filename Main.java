package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("hello nama saya asep");
        System.out.println("masukan angka: ");
        int angka = input.nextInt();
        int hasil = angka * angka;
        System.out.println(hasil);

    }
}
