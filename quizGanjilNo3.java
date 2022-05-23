package com.company;

import java.io.*;
import java.util.Scanner;
public class quizGanjilNo3 {
    //Farhan Nuryadi R3B (202043500181)
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x;
        int menuArray[] = new int[4];
        int harga=0, total=0, no=0, jumlahPesanan=0, totalMenu=0;
        String expresi = " ";
        File dataFile = new File("D:/menu_FarhanNuryadi.txt");

        try {
            Scanner data = new Scanner(dataFile);
            int Num = 0;
            while (data.hasNextLine()) {
                String line = data.nextLine();
                Num++;
                if (line.equals("-----------------------------")) {
                    while (data.hasNextLine()) {
                        line = data.nextLine();
                        if (line.equals("-----------------------------"))
                            break;
                        String[] menu = line.split(" "); // harga menu
                        menuArray[totalMenu] = Integer.parseInt(menu[menu.length - 1]); // menyimpan harga menu ke array
                        totalMenu++;
                    }
                    data.close(); // menutup scanner file
                    break;
                }
            }

            data = new Scanner(dataFile); // membaca ulang scanner file
            while (data.hasNextLine()) {
                x = data.nextLine();
                System.out.println(x);
            }

            System.out.print("Order ? (y/t) : ");
            expresi = input.readLine();
            while (expresi.equalsIgnoreCase("y")) { //expresi
                System.out.print("No Pesanan : ");
                no = Integer.parseInt(input.readLine());
                System.out.print("Jumlah : ");
                jumlahPesanan = Integer.parseInt(input.readLine());

                harga = menuArray[no - 1] * jumlahPesanan; // perhitungan harga * jumlah

                System.out.print("Pesan lagi ? (y/t) : ");
                expresi = input.readLine();
                total += harga; //perhitungan total
            }

        } catch (Exception e) {
            System.out.println("Error"+e.getMessage()); }

        System.out.println("Total : Rp." + total);
    }
}
