/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author compaq
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int Tahun = 2021;
    int TahunLahir;
    System.out.println("Tahun berapa anda lahir");
    TahunLahir = input.nextInt();
    int Umur = Tahun - TahunLahir;
    System.out.println("Anda berumur: "+ Umur);
    
    System.out.println("Masukan Panjang sisi A");
    int A = input.nextInt();
    System.out.println("Masukan Panjang sisi B");
    int B = input.nextInt();
    System.out.println("Masukan Panjang sisi C");
    int C = input.nextInt();
    int kelilingsegitiga = A + B + C;
    System.out.println("Keliling Segitiga adalah "+ kelilingsegitiga);
    }
    
}
