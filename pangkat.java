package com.company;

class pangkat {
    public static void main(String[] args) {
        pangkat p = new pangkat();
        System.out.print(" 3 pangkat 6 : ");
        System.out.print(p.hitungPangkat(3,6));
    }
    public int hitungPangkat(int x, int y){
        if (y==1){
            return x;
        }
        else {
            return x*hitungPangkat(x,y-1);
        }
    }
}
