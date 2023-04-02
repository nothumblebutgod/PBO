//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi); //interface hanya seperti ini

    public void setLuas(double l){ //tidak dapat di interface karena implementasi
        luas = 1;
    }

    public double getLuas(){ //tidak dapat diinterface karena implementasi
        return luas;
    }
}