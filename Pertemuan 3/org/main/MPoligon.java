//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		SegiTiga segitiga = new SegiTiga(4,5,6);
        segitiga.printInfo();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
    }
}