/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan47_nilaimahasiswa;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan index nilai,
* nilai akhir, dan keterangan dengan quis, uts, dan uas yg ditentukan
 */
public class PBO3_10117082_Latihan47_NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nm = new NilaiMahasiswa(60,80,75);
        System.out.println("QUIZ\t\t = "+nm.getQuiz());
        System.out.println("UTS\t\t = "+nm.getUts());
        System.out.println("UAS\t\t = "+nm.getUas()+"\n");
        System.out.println("Nilai Akhir\t = "+nm.nilaiAkhir()+"\n");
        System.out.println("Index\t\t = "+nm.indexNilai());
        System.out.println("Keterangan\t = "+nm.keterangan()+"\n\n\n");
    
       
    }
    
}
