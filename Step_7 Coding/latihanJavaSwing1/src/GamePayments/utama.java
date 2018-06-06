/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GamePayments;

/**
 *
 * @author UKRIDA
 */
public class utama {

    public static void main(String[] args) {
        koneksi konek = new koneksi();
        konek.koneksi();    
        
        new MenuInterface().setVisible(true);
    }
    
}
