package com.company;

public class pertemuan3c3 {
    public static void main(String[] args) {
        int bilangan [][]=new int[5][5];
        int baris,kolom;
        for (baris=0; baris<5; baris++){
            for (kolom=0; kolom<5; kolom++){
                bilangan[baris][kolom]=(baris+1)*(kolom+1);
                System.out.printf("%d\t",bilangan[baris][kolom]);
            }
            System.out.println("\n0");
        }
    }
}
