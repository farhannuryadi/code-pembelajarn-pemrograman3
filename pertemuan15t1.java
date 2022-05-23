package com.company;

import java.sql.*;
import java.util.Scanner;
public class pertemuan15t1 {
    public static void main (String[] args){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:D:/db_R3B/DataBase_RT.db");
            Statement stat = con.createStatement();

            Scanner input = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Apakah Ingin Mengakses DataBase RT? Y/T : "); String excep = input.next();

            while (excep.equalsIgnoreCase("Y")){
                System.out.println("<<<<<<<<<< Menu Akses DataBase RT >>>>>>>>>>");
                System.out.println("--------------------------------------------");
                System.out.println("1. Menampilkan DataBase RT");
                System.out.println("2. Menambah Record DataBase RT");
                System.out.println("3. Merubah Record DataBase RT");
                System.out.println("4. Menghapus Record DataBase RT");
                System.out.println("--------------------------------------------");
                System.out.print("Pilih Akses Dengan Nomor : "); byte pil = input.nextByte();
                System.out.println();

                switch (pil){
                    case 1 : {
                            ResultSet rs = stat.executeQuery("select * from warga;");
                            System.out.println("Menampilkan DataBase RT :");
                            System.out.println("--------------------------------------------");
                            System.out.println("Nama\tUmur\tJenis Kelamin\tAgama\tPendidikan");
                            while (rs.next()) {
                                System.out.print(rs.getString("nama"));
                                System.out.print("\t" + rs.getInt("umur"));
                                System.out.print("\t"+rs.getString("jenis_kelamin"));
                                System.out.print("\t"+rs.getString("agama"));
                                System.out.println("\t"+rs.getString("pendidikan"));
                            }
                            System.out.println();
                        } break;

                    case 2 :{
                            System.out.println("Menambah Record DataBase RT");
                            System.out.println("--------------------------------------------");
                            System.out.print("Nama          : "); String nama = input.next();
                            System.out.print("Umur          : "); short umur = input.nextShort();
                            System.out.print("Jenis Kelamin : "); String jenisKelamin = input.next();
                            System.out.print("Agama         : "); String agama = input.next();
                            System.out.print("Pendidikan    : "); String pendidikan = input.next();
                            stat.executeUpdate("insert into warga values('"+nama+"',"+umur+",'"+jenisKelamin+"','"+agama+"','"+pendidikan+"');");
                            System.out.println();
                        }break;

                    case 3 :{
                            System.out.println("Merubah Record DataBase RT : ");
                            System.out.println("--------------------------------------------");
                            System.out.print("Nama          : "); String nama = input.next();
                            System.out.print("Umur          : "); short umur = input.nextShort();
                            System.out.print("Agama         : "); String agama = input.next();
                            System.out.print("Pendidikan    : "); String pendidikan = input.next();
                            stat.executeUpdate("update warga set umur="+umur+",agama='"+agama+"',pendidikan='"+pendidikan+"' where nama='"+nama+"';");
                            System.out.println();
                        }break;

                    case 4 :{
                            System.out.println("Menghapus Record DataBase RT");
                            System.out.println("--------------------------------------------");
                            System.out.print("Nama          : "); String nama = input.next();
                            stat.executeUpdate("delete from warga where nama='"+nama+"';");
                            System.out.println();
                        }break;

                    default:
                        System.out.println("Maaf Nomor Akses Salah!!");
                        System.out.println();
                }
                System.out.print("Ingin Mengakses Kembali? Y/T : "); excep = input.next();
                System.out.println();
            }
            System.out.println("<<< Keluar Dari Akses >>>");

        }catch (Exception e){
            System.out.println("Kesalahan "+e.getMessage());
        }
    }
}
