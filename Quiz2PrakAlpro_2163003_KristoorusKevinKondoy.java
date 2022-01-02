/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.pkg2.prak.alpro_2163003_kristoorus.kevin.kondoy;
import java.util.Scanner;
/**
 *
 * @author compaq
 */
public class Quiz2PrakAlpro_2163003_KristoorusKevinKondoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        float pound_sterling = 19550;
        float rupiah;
        System.out.println("berapa angka rupiahnya");
        rupiah = Input.nextInt();
        float nilai_pound = rupiah / pound_sterling;
        System.out.println("Nilai poundnya adalah "+ nilai_pound);
        
        float yen = 124;
        float Rupiah;
        System.out.println("berapa angka rupiahnya");
        Rupiah = Input.nextInt();
        float nilai_yen = Rupiah / yen;
        System.out.println("Nilai yennya adalah "+ nilai_yen);
        
        
        float detik;
        System.out.println("berapa detik yang ingin dikonversi");
        detik = Input.nextInt();
        float menit = detik / 60;
        System.out.println("Menitnya adalah "+ menit);
        
        System.out.println("Masukan jumlah uang");
        float jumlah_uang;
        jumlah_uang = Input.nextInt();
        System.out.println("Masukan persennya");
        float persen = Input.nextInt();
        float persentase_uang = jumlah_uang * persen / 100;
        System.out.println("bunga uang per tahunnya "+ persentase_uang);
    }
    
}
