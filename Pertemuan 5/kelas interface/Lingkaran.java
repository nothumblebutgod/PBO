
//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI * jejari * jejari;
	}
}    