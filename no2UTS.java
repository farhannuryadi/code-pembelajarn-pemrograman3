package com.company;

import java.util.Locale;
import java.util.Scanner;

public class no2UTS {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("NPM \t: "); String npm = x.nextLine();
        System.out.println("Nama \t: "); String nama = x.nextLine();

        String NAMA="";
        if (nama.length()<=15){ NAMA=nama.toUpperCase();}
        else {NAMA=nama.toLowerCase();}

        for (int a=0; a<nama.length(); a++){
            System.out.println((a+1)+"\t"+NAMA.substring(a));
        }
    }
}
