/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan43.gajipegawai;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Gaji Pegawai
 *  
 */
public class PBO310117116Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GajiPegawai gajipegawai = new GajiPegawai();
        gajipegawai.setNama("Muhammad Fitrayana");
        gajipegawai.setAlamat("Jalan Unisba IV No. 73");
        gajipegawai.setUangTransport(250000);
        gajipegawai.setUangTunjangan(300000);
        gajipegawai.setGajiPokok(4500000);
        gajipegawai.setTotalGaji(gajipegawai.totalGaji(
                    gajipegawai.getUangTunjangan(),
                    gajipegawai.getUangTransport(), 
                    gajipegawai.getGajiPokok()));
        gajipegawai.tampilData(gajipegawai.getNama(), gajipegawai.getAlamat(), 
                               gajipegawai.getUangTunjangan(), 
                               gajipegawai.getUangTransport(), 
                               gajipegawai.getGajiPokok(), 
                               gajipegawai.getTotalGaji());
    }
    
}
