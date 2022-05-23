package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class quizGenap {
    public static void main (String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_coba/UAS2020.db");
            Statement stat = con.createStatement();

            Scanner input = new Scanner(System.in);
            System.out.println("Penjualan Obat");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Input Kode Obat : "); String excep = input.next();
            System.out.println("--------------------------------------------------------------");

            String kode = null,namaObat = null,satuan=null;
            int hargaBeli=0,hargaJual=0,stok=0;
            ResultSet rs = stat.executeQuery("select * from obat where Kode='"+excep+"'");
            while (rs.next()) {
                kode=rs.getString("Kode");
                namaObat=rs.getString("Nama_Obat");
                satuan=rs.getString("Satuan");
                hargaBeli=rs.getInt("Harga_Beli");
                hargaJual=rs.getInt("Harga_Jual");
                stok=rs.getInt("Stok");
            }

            System.out.println("Nama Obat : "+namaObat);
            System.out.println("Satuan    : "+satuan);
            System.out.println("Harga     : "+hargaJual);
            System.out.println("--------------------------------------------------------------");

            System.out.print("Jumlah Beli : "); int jumlah = input.nextInt();
            System.out.println("--------------------------------------------------------------");
            int total=jumlah * hargaJual;
            System.out.println("Total >> 20 Tablet x Rp "+hargaJual+",-    : Rp"+total+",-");
            System.out.println("--------------------------------------------------------------");

        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
