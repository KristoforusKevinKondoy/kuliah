/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.operation.logika.java_2163003_kristoforus.kevin.kondoy;
import java.util.Scanner;
/**
 *
 * @author compaq
 */
public class TugasOperationLogikaJava_2163003_KristoforusKevinKondoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Harga barang ke-1:");
        int barang1 = input.nextInt();
        System.out.println("Masukan Harga barang ke-2:");
        int barang2 = input.nextInt();
        System.out.println("Masukan Harga barang ke-3:");
        int barang3 = input.nextInt();
        int Total = barang1 + barang2 + barang3;
        if(Total > 250000){
            Total = Total - ( Total * 15 / 100 );
            System.out.println("Total dari Hasil diskon " + Total);
        } else {
            System.out.println("Total anda " + Total);
            
        }
        System.out.println("Masukan jumlah lembar");
        int Lembar = input.nextInt();
        int lembar_per_perangko = 5;
        double hasil = Lembar / lembar_per_perangko + 1;
        double total = Math.ceil(hasil);
        System.out.println("perangko yang dipakai berdasarkan jumlah lembar " + total);
        
    }
    
}
