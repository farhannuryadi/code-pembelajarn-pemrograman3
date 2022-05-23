package com.company;

import java.io.*;
import java.util.Scanner;
public class Quiz3 {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String z;
        int men[] = new int[10];
        int harga=0, total=0, no=0, jumlahPesanan=0, totalMenu=0;
        String pilih = " ";
        File dataFile = new File("D:/menu_FarhanNuryadi.txt");

        try {
            Scanner data = new Scanner(dataFile);
            int lineNum = 0;
            while (data.hasNextLine()) {
                String line = data.nextLine();
                lineNum++;
                if (line.equals("-----------------------------")) {
                    while (data.hasNextLine()) {
                        line = data.nextLine();
                        if (line.equals("-----------------------------"))
                            break;
                        String[] menu = line.split(" ");
                        men[totalMenu] = Integer.parseInt(menu[menu.length - 1]);
                        totalMenu++;
                    }
                    data.close();
                    break;
                }
            }

            data = new Scanner(dataFile);
            while (data.hasNextLine()) {
                z = data.nextLine();
                System.out.println(z);
            }

            System.out.print("Order ? (y/t) : ");
            pilih = input.readLine();
            while (pilih.equalsIgnoreCase("y")) {
                System.out.print("No Pesanan : ");
                no = Integer.parseInt(input.readLine());
                System.out.print("Jumlah : ");
                jumlahPesanan = Integer.parseInt(input.readLine());

                harga = men[no - 1] * jumlahPesanan;

                System.out.print("Pesan lagi ? (y/t) : ");
                pilih = input.readLine();
                total += harga;
            }

        } catch (Exception e) {
            System.out.println("Error"+e.getMessage()); }

        System.out.println("Total : Rp." + total);
    }
}

