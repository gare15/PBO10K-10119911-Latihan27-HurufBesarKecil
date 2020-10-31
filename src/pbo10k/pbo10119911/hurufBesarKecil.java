/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class hurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String txt;
        
        System.out.println();
        System.out.print("Masukkan Kalimat : ");
        txt = scan.nextLine();
        System.out.println("======Hasil Formatting======");
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
    }
    
}
