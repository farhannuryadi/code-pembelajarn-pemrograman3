package com.company;

public class pertemuan5t1 {
    public static void main(String[] args) {
        String f="Pemrograman Java";
        //        0123456789012345
        for (int i=0; i<=f.length(); i++){
            System.out.println(f.substring(i,16));
        }

        for (int i=0; i<=f.length(); i++) {
            System.out.println(f.substring(i, i + 1));
        }

        for (int i=0; i<=f.length(); i++){
            System.out.println(f.substring(f.length()-i));
        }
    }
}
