package com.company;

public class pertemuan4c2 {
    public static void main(String[] args) {
        //Menangkap bentuk eksepsi (bentuk pertama)
        //try {
                //kode yang mungkin mengakibatkan eksepsi
        //}
        //catch (parameter){
                //kode yang akan dijalankan jika terjadi eksepsi
        //}
        System.out.println("Sebelum Pembagian ...");
        try {
            System.out.println(5 / 0);
        } catch (Throwable t) {
            System.out.println("terjadi pembagian nol");
        }
        System.out.println("Sesudah Pembagian ...");
    }
}
