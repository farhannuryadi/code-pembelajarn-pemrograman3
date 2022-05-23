package com.company;

import java.util.Scanner;

public class contohUas1 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("digit terakhir npm anda : "); int npm = abc.nextInt();
        System.out.println(uas(npm));
    }

    static int uas (int a){
        if (a==0) {return 2;}
        else {return 3*uas(a-1)-3;}
    }
}
