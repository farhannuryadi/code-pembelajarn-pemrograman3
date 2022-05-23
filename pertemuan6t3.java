package com.company;


import java.util.Scanner;
public class pertemuan6t3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("menghitung volume dan luas bola");
        System.out.print("masukan nilai r : ");
        int r = input.nextInt();

        double luas=0.0,volume=0.0;
        volume=(4*Math.PI*Math.pow(r,3)/3);
        luas=4*Math.PI*Math.pow(r,2);

        System.out.println("hasil volume bola : "+volume);
        System.out.println("hasil luas   bola : "+luas);
    }
}
