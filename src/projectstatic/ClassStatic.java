/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstatic;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class ClassStatic {
   String judul =("PENYEWAAN MOBIL HIDAYAH");
    String judul(){
        return judul;
    }
    static void identitas(){
        System.out.println("========================================================");
        String nama, alamat, tipemobil, plat;
        Double nomerhp;
        
        //scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.println("Masukkan Alamat = ");
        alamat = input.nextLine();
        System.out.println("Masukkan Nomor HP = ");
        nomerhp = input.nextDouble();
        System.out.println("========================================================");
        
        //pemanggilan 
        System.out.println("Nama penyewa = "+nama);
        System.out.println("Alamat penyewa = "+alamat);
        System.out.println("Nomor HP = "+nomerhp);
        System.out.println("========================================================");
    }
    static void mobil(){
        //daftar mobil
        Scanner input = new Scanner(System.in);
        String[]mobil = {"Pajero","Fortuner","Avanza"};
        
        for (int i = 0; i <mobil.length; i++)
            System.out.println(i+". "+mobil[i]);
        System.out.println("--------------------------------------------------------");
       
        System.out.println("Silahkan masukkan nomor mobil yang ingin disewa = ");
        int pilihan = input.nextInt();
        System.out.println("Mobil yang dipilih : "+mobil[pilihan]);
        System.out.println("========================================================");
    }
    static void peminjaman(){
        //peminjaman
        Scanner input = new Scanner(System.in);
        
        String[]lama = {"3 hari","5 hari","8 hari"};
        int [] harga = {2000000, 4000000 , 6000000};
        int kembali;
        for (int i = 0; i <lama.length; i++)
            System.out.println(i+". "+lama[i]+" -> "+harga[i]);
        System.out.println("--------------------------------------------------------");
        
        System.out.println("Silahkan masukkan nomor lama meminjam = ");
        int pilihan = input.nextInt();
        System.out.println("Lama peminjaman : "+lama[pilihan]+" -> "+harga[pilihan]);
        System.out.println("========================================================");
        
        //pembayaran
        boolean c = true;
        while(c){
            System.out.println("Silahkan masukkan uang anda");
        int uang = input.nextInt();
            if(uang==harga[pilihan]){
                System.out.println("*********************************************");
                System.out.println("Silahkan Menikmati Perjalanan Anda, Uang Anda Pas");
                c = false;
            }else if(uang>harga[pilihan]){
                kembali = uang-harga[pilihan];
                System.out.println("Silahkan Menikmati Perjalanan Anda dan Kembalian Sebesar "+kembali);
                c = false;
            }else if(uang<harga[pilihan]){
                System.out.println("UANG ANDA KURANG, SILAHKAN MASUKKAN ULANG UANG ANDA!");
                c = true;}
            System.out.println("========================================================");
        }
    }
}
