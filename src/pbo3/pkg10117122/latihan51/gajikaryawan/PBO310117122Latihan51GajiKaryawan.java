/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Aldy Senda
 * Nama  : Bonaventura Aldino Senda Seni
 * NIM   : 10117122
 * Kelas : IF-3
 * Deskripsi Program : Program ini dibuat untuk menghitung gaji total karyawan,
 *                     dimana gaji total berasal dari tunjanganjabatan + 
 *                     tunjangan golongan + tunjangan kehadiran. Dimana masing-
 *                     masing tunjangan mandapatkan biaya yang berbeda, dengan 
 *                     inputan dari user, dan implementasi koding menggunakan 
 *                     pendekatan berbasis objek.
 * 
 */
public class PBO310117122Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        
        Manager manager= new Manager();
        System.out.print("Masukkan NIK       : "); 
        manager.setNik(input1.next());
        System.out.print("Masukkan Nama Anda : "); 
        manager.setNama(input2.next());
        System.out.print("Masukkan Golongan (1/2/3)         : ");
        manager.setGolongan(input3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag)  : ");
        manager.setJabatan(input4.next());
        System.out.print("Masukkan Jabatan Jumlah Kehadiran : ");
        manager.setKehadiran(input5.nextInt());
        
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK\t: " + manager.getNik());
        System.out.println("Nama\t: " + manager.getNama());
        System.out.println("Golongan: " + manager.getGolongan());
        System.out.println("Jabatan\t: " + manager.getJabatan());
        
        System.out.println("\nTUNJANGAN JABATAN\t: Rp " + 
                manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("TUNJANGAN GOLONGAN\t: Rp " + 
                manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: Rp " + 
                manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t: Rp " + manager.gajiTotal());
    }
    
}
