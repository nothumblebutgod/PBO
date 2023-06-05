//Nama : Ananda Rizky Pratama
//NIM  : 24060121140118
//Lab  : PBO C1

public class Manajer extends Pegawai {
    private int tunjangan = 700000; 
    
    public Manajer(String nama) {
        super.SetNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan); //this untuk nunjuk parameter
    }
}