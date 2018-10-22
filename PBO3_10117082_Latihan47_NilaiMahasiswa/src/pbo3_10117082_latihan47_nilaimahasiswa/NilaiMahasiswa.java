/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan47_nilaimahasiswa;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan index nilai,
* nilai akhir, dan keterangan dengan quis, uts, dan uas yg ditentukan
 */
public class NilaiMahasiswa {
    private double quiz;
    private double uts;
    private double uas;
    private double nilaiAkhir;
    private char index;
    
    public NilaiMahasiswa(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public double nilaiAkhir() {
        quiz = quiz * 0.2;
        uts = uts * 0.3;
        uas = uas * 0.5;
        double nilaiAkhir = quiz+uts+uas;
    return this.nilaiAkhir=nilaiAkhir;
    }

    public char indexNilai() {
        char idx = ' ';
        if (80 < nilaiAkhir && nilaiAkhir <= 100) {idx='A';}
        else if (68 < nilaiAkhir && nilaiAkhir <= 80) {idx='B';}
        else if (56 < nilaiAkhir && nilaiAkhir <= 68) {idx='C';}
        else if (45 < nilaiAkhir && nilaiAkhir <= 56) {idx='D';}
        else if (0 < nilaiAkhir && nilaiAkhir <= 45) {idx='E';}
        else {idx = '-';}
    return this.index=idx;}

    public String keterangan() {
       String ket = " ";
        switch (index) {
            case 'A':  ket="Sangat Baik"; break;
            case 'B':  ket="Baik"; break;
            case 'C':  ket="Cukup"; break;
            case 'D':  ket="Kurang"; break;
            case 'E':  ket="Sangat Kurang"; break;
        }
    return ket;}

}
