/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author MY PC
 */
public class Karyawan {
    final private String nik;
    final private String nama;
    final private String gender;
    final private String golongan;
    final private int gajiPokok;
    final private int potongan;
    final private int tunjangan;
    private int total;

    public Karyawan(String nik, String nama, String gender, String golongan, int gajiPokok, int potongan,int tunjangan) {
        this.nik = nik;
        this.nama = nama;
        this.gender = gender;
        this.golongan = golongan;
        this.gajiPokok = gajiPokok;
        this.potongan = potongan;
        this.tunjangan = tunjangan;
   
    }
   
    void calculateTotal () {
        this.total = (this.gajiPokok + this.tunjangan) - this.potongan;
    }
    
    int getTotal () {
        return this.total;
    }
}
