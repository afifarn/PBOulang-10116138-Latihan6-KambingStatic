/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6_KambingStatic;

/**
 *
 * @author 
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Implementasi Dua Kelas
 */
public class Mamalia {
    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}
    
 public class KambingStatic  {
    
// NAMA_KAMBING sebagai konstanta 
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING+"memiliki kambing sebanyak"+ Mamalia.jumlahKambing);
    }
    
}
