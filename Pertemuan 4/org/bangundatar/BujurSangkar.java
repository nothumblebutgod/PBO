//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getpanjangSisi() {
		return this.panjangSisi;
    }
}