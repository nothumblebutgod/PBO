//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getpanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas(){ 
		double panjangSisi = permukaan.getpanjangSisi();
		return panjangSisi * panjangSisi;
	}
}