package com.company;

public class pertemuan4c3 {
    public static void main(String[] args) {
        //Menangkap bentuk eksepsi (bentuk pertama)
        // try {
                //kode yang mungkin mengakibatkan eksepsi
        //}
        //finally{
                //kode yang akan dijalankan terakhir kali
        //}
        System.out.println("Sesudah Pembagian ...");
        double bil = 100.0;
        for (int i=5; i>=0; i--) {
            try {
                System.out.print(bil+"/"+i+" = ");
                System.out.println(bil/i);
            } finally {
                System.out.println("Menjalankan Bagian Finally");
            }
        }
        System.out.println("Selesai Pembagian...");
    }
}
