package com.tugasPBO;

import java.util.Scanner;
//nama = Argya Aulia Fauzandika
//nim = 10119035
//kelas = IF1
//Deskripsi = menentukan berapa lama waktu menabung hingga saldo mencapat target

public class targetTabungan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan saldo awal : ");
        int saldoAwal = scanner.nextInt();
        System.out.print("masukkan bunga : (%)");
        String bunga = scanner.next();
        System.out.print("masukkan target tabungan : ");
        int target = scanner.nextInt();
        hitung(saldoAwal,bunga,target);
    }

    public static void hitung(int saldoAwal, String bunga, int target){
        double bungaString= Double.parseDouble(bunga); //ubah string ke double
        double bungaFinal = bungaString/ 100 + 1;
        int i = 1;
        while(saldoAwal < target){
            saldoAwal *= bungaFinal;
            System.out.println("saldo di bulan ke-" + i + " Rp " + saldoAwal);
            i++;
        }
    }
}
