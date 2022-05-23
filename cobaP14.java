package com.company;

import java.sql.*;
import java.util.Scanner;
class cobaP14 {
    public static void main(String[] args) throws Exception{
        int jumlah,npm;
        double UTS,UAS;
        String namaMhs;
        Scanner input = new Scanner(System.in);
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/Nilai_MHS.db");
        Statement st = con.createStatement();
        st.executeUpdate("drop table if exists nilai;");
        st.executeUpdate("create table nilai (npm integer, namaMhs varchar(25), UTS real, UAS real);");

        System.out.println("<<<<< Masukan Nilai Mahasiswa ke dalam database >>>>>");
        System.out.print("Jumlah Mahasiswa    : "); jumlah = input.nextInt();

        for (int i=1; i<=jumlah; i++){
            System.out.println("Data Mahasiswa ke-"+i);
            System.out.print("NPM Mahasiswa   : "); npm = input.nextInt();
            System.out.print("Nama Mahasiswa  : "); namaMhs = input.next();
            System.out.print("Nilai UTS       : "); UTS = input.nextDouble();
            System.out.print("Nilai UAS       : "); UAS = input.nextDouble();

            st.executeUpdate("insert into nilai values ("+npm+",'"+namaMhs+"',"+UTS+","+UAS+")");

        }
        ResultSet rs=st.executeQuery("select * from nilai;");
        System.out.println ("NPM\t Nama Mahasiswa\t UTS\t UAS\t");
        while (rs.next()){
            System.out.print(rs.getInt("npm"));
            System.out.print("\t "+rs.getString("namaMhs"));
            System.out.print("\t "+rs.getString("UTS"));
            System.out.println("\t "+rs.getString("UAS"));
        }


    }
}
