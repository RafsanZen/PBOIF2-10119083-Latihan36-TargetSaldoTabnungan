/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119083.latihan36.targetsaldotabnungan;

/**
 *
 * Nama : Rafsan Zen Mustaofa 
 * NIM  : 10119083
 * Kelas: IF-2
 * Deskripsi: Program Saldo Tabungan
 */
public class PBOIF210119083Latihan36TargetSaldoTabnungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setSaldoTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
        
         System.out.println("Developed by : Muhammad Idris Merdefi");
        
    }
    
}
