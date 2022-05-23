package com.company;

public class quizgenapNo1 {
    public static void main(String[] args) {
        System.out.println(fungsi(5));
    }

    static int fungsi (int a){
        if (a==0) return 3;
        else return 2*fungsi(a-1);
    }
}
