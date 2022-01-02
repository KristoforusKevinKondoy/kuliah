/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.huruf.ganjil.genap.dan.huruf.vokal.konsonan_2163003_kristoforus.kevin.kondoy;
import java.util.Scanner;
/**
 *
 * @author compaq
 */
public class TugasHurufGanjilGenapDanHurufVokalKonsonan_2163003_KristoforusKevinKondoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan angka");
        int Angka = input.nextInt();
        if (Angka % 2 == 0){
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }
        String[] vokal = {"a","i","u","e","o"};
        System.out.println("Input hurufnya");
        String huruf = input.next();
        for(int i = 0; i < 5; i++){
            if (huruf.equalsIgnoreCase(vokal[i])){
                System.out.println("Huruf vokal");
                return;
            }
        }
        System.out.println("Huruf konsonan");
        }
    
    
}
