//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2 * 3.14 * jejari;
    }
}
