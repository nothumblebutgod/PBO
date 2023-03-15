//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

package org.bangundatar;

import org.poligon.Poligon;

public class SegiTiga extends Poligon{
   private double alas, tinggi;

   public SegiTiga(double alas, double tinggi, int jumlahSisi){
       this.alas = alas;
       this.tinggi = tinggi;
       this.jumlahSisi = jumlahSisi;
   }

   public double hitungLuas(){
       return (alas * tinggi)/2;
   }

   public void printInfo(){
       System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
   }
}
