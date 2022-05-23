package com.company;

public class pertemuan11c1 {
    public static void main (String[] args){
        System.out.println(faktorial(5));
    }

    static int faktorial (int a){
        if (a == 0) return 1;
        else return a*faktorial(a-1);
    }
}
