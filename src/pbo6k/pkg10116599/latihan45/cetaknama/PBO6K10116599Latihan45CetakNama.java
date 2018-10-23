/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program :
 *
 */
public class PBO6K10116599Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // Inisialisasi
        Printer printer = new Printer();

        System.out.println("===== Aplikasi Pencetak Nama =====");
        
        System.out.print("Masukkan Nama Anda : ");
        String namamu = scan1.nextLine();
        printer.setNama(namamu);

        System.out.print("Mau cetak nama berapa kali? : ");
        int ulang = scan2.nextInt();
        printer.setJmlCetak(ulang);

        printer.cetak(namamu);
        
        System.out.println("Hasil Cetak");
        printer.cetak(ulang, namamu);
        
        
        
        
       
        

    }

}
