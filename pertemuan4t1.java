package com.company;

import java.util.Scanner;
public class pertemuan4t1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Masukan Banyak baris : ");
        int baris = input.nextInt();
        System.out.print("masukan Kolom : ");
        int kolom = input.nextInt();
        int data[][]=new int[baris][kolom];

        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.print("masukan baris ["+i+"] kolom ["+j+"] : ");
                data[i][j]=input.nextInt();
            }
        }

        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }


    }
}
