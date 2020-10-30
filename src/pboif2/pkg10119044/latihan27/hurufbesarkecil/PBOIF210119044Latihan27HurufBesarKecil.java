/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan huruf besar semua dan huruf kecil semua
 * dalam suatu kalimat
 */

public class PBOIF210119044Latihan27HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+(kalimat.toUpperCase()));
        System.out.println("Huruf Besar : "+(kalimat.toLowerCase()));
    }
    
}
