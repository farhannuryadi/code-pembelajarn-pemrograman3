package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class No4 {
    public static void main (String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connec = DriverManager.getConnection("jdbc:sqlite:D:/db_Y3E_Alfian/AlfianMuzaki.db");
            Statement st = connec.createStatement();

            Scanner sc = new Scanner(System.in).useDelimiter("\n");
            DecimalFormat n = new DecimalFormat("#.##");
            String npm=" ",nama=" ",kls=" ",syarat=" ";
            int teori=0,praktik=0;
            double nilai;

            System.out.println("~UBAH DATA NILAI MAHASISWA~");
            System.out.println("=============================================================================");
            System.out.print("Input NPM             : ");
            String find = sc.next();
            System.out.println("~Hasil pencarian data~");
            System.out.println("-----------------------------------------------------------------------------");

            ResultSet rs = st.executeQuery("select * from mahasiswa where NPM='"+find+"';");
            while (rs.next()) {
                npm=rs.getString("NPM");
                nama=rs.getString("Nama");
                kls=rs.getString("Kelas");
                teori=rs.getInt("Teori");
                praktik=rs.getInt("Praktikum");
            }

            System.out.println("\t Nama             : "+nama);
            System.out.println("\t Kelas            : "+kls);
            System.out.println("\t Nilai Teori      : "+teori);
            System.out.println("\t Nilai Praktikum  : "+praktik);
            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("~Input perubahan data~");
            System.out.print("Input Nama             : ");
            nama = sc.next();
            System.out.print("Input Kelas            : ");
            kls = sc.next();
            System.out.print("Input Nilai Teori      : ");
            teori = sc.nextInt();
            System.out.print("Input Nilai Praktikum  : ");
            praktik = sc.nextInt();
            //st.executeUpdate("update mahasiswa set Nama='"+nama+"',Kelas='"+kls+"',Teori="+teori+",Praktikum="+praktik+" where NPM='"+find+"';");

            System.out.println("=============================================================================");
            System.out.println("\t\t\t DATA NILAI MAHASISWA");
            System.out.println("=============================================================================");
            nilai=(double) (teori*0.3)+(praktik*0.7);
            if (nilai>=70){ syarat="LULUS"; }
            else { syarat="TIDAK LULUS"; }
            System.out.println("NPM \t\t Nama Mahasiswa \t Kelas \t Teori \t Praktikum \t Nilai Akhir \t Keterangan");
            System.out.println(npm+"\t\t"+nama+"\t\t"+kls+"\t\t"+teori+"\t\t"+praktik+"\t\t"+n.format(nilai)+"\t\t"+syarat);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
